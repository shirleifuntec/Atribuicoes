package edu.funtec.listaencadeada;

public class ListaEncadeada<T> {

    private No<T> referenciaEntrada; //criando o tipo generico

    //Constutor
    public ListaEncadeada() { 
        this.referenciaEntrada = null; //instanciando a classe = nulo
    }

    public void add(T conteudo){
        No<T> novoNo = new No(conteudo); //Nó tipo generico
        if(this.isEmpty()){ //testar se alista esta vazia
            referenciaEntrada = novoNo; // igual a noov no
            return;
        }
        No<T> noAuxiliar = referenciaEntrada; //recebe a ref de entrada
        for(int i = 0; i < size() - 1; i++){ //for do inicio da  lista até o tamanho dela
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo); //vai de nó em nó e seta o porximo nó como novo né
    }

    //retorna o conteudo
    public T get(int index){
        return getNo(index).getConteudo();
    }

    
    //aqui retona o nó
    private No<T> getNo(int index){//privado pq é um metodo interno da classe
        validaIndice(index); //metodo valida indice
        No<T> noAuxiliar = referenciaEntrada;//nó tipo generico
        No<T> noRetorno = null;//declarar no generico de retorno
        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;//guardar o no de retorno
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    //retona o conteudo do nó que ele removeu
    public T remove(int index){//medoto de tipo generico
        validaIndice(index);
        No<T> noPivor = getNo(index);//pivor, o no que estou querendo remover
        if(index == 0){ //se o indice for igual a zero, vou remover meu primeiro nó
            referenciaEntrada = noPivor.getProximoNo();//aqui pegamos o segundo nó
            return noPivor.getConteudo(); //retorna o conteudo
        }
        No<T> noAnterior = getNo(index - 1); //se não for o indice zero, dou um get nele e menos 1  
        noAnterior.setProximoNo(noPivor.getProximoNo());//
        return noPivor.getConteudo();
    }

    //Método Size, retorna o tamanho da lista
    public int size(){
        int tamanhoLista = 0; //declara a variavel q ai guardar o tamanho da lista
        No<T> referenciaAux = referenciaEntrada; //passando a referencia
        while(true){
            if(referenciaAux != null){//testando se o ponteiro onde estou é nulo
                tamanhoLista++;
                // se o no despois da referncia é nulo, e se possitivo vai para o proximo nó
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }
            }else{//cai aqui se alsita estiver vazia
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index){ 
        if(index >= size()){ //valida se o indice não é maior q o tamanho da lista
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + '.');
        }
    }
    
//método isEmpty
    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    public No<T> getReferenciaEntrada() {
        return referenciaEntrada;
    }

    public void setReferenciaEntrada(No<T> referenciaEntrada) {
        this.referenciaEntrada = referenciaEntrada;
    }

    //ToString
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();//correndo a lista para impressão
        }
        strRetorno += "null";
        return strRetorno;
    }

}
