package edu.funtec.listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {

    // as duas entradas da lista
	private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista = 0;//variavel para utilizar no metodo size
    
    //construtor
    public ListaDuplamenteEncadeada() {
    	this.primeiroNo = null;
    	this.ultimoNo = null;
    	this.tamanhoLista = 0; //para ter certeza que o primeiro da lista é zsero
    }
    
  
  

    public void add(T elemento){//recebe o conteúdo
        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);//novo nó com o elemento, e as ref estão nulas
        // não tem ninguem a frenre dele
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);//aponta para o antigo ultimo nó
        if(primeiroNo == null){
            primeiroNo = novoNo;//proximo igual ao novo nó
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo); 
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    
    //método add(el,index)
    public void add(int index, T elemento){//recebe o conteúdo e o indice
        NoDuplo<T> noAuxiliar = getNo(index); // recebe o indice e reutilizamos o medoto getindice
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);//novo nó com o elemento, e as ref estão nulas
        // não tem ninguem a frente dele
        novoNo.setNoProximo(noAuxiliar); //se for nulo passa direto

        if(novoNo.getNoProximo() != null) { //testar se o primeiro nó é nulo
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio()); //se for !nulo, get no previo
            novoNo.getNoProximo().setNoPrevio(novoNo); //proximo igual ao novo nó
            //aqui estamos colocando o novo nó no meio
        }else {
            novoNo.setNoPrevio(ultimoNo);//atualmenento o ultimo novo
            ultimoNo = novoNo; //novo ultimo nó
        }
        if(index == 0){
            primeiroNo = novoNo;//se for o primeiro, ja recebe o nó
        }else {
            novoNo.getNoPrevio().setNoProximo(novoNo);//senoa o proximo no do no anterior é o novo nó
        }
        tamanhoLista++;
    }

    //metodo remove
    public void remove(int index){
    	//remoção do primeiro nó
        if(index == 0){//testar se estou no primeiro nó
            primeiroNo = primeiroNo.getNoProximo(); 
            if(primeiroNo != null){//se tiver uma lista com um so no, o segundo nó é nulo
                primeiroNo.setNoPrevio(null);
            }
        }else{
        	//remoção de nós do meio
            NoDuplo<T> noAuxiliar = getNo(index);
            //pegamos o nó auxiliar no indice, a referencia de proximo, ja esta pegando o outro nó proximo
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
          //testando se é o ultimo
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            }else{
                ultimoNo = noAuxiliar;
            }
        }
        tamanhoLista--;//removendo do tamanho da lista
    }

    
    //método get
    public T get(int index){//indice
        return getNo(index).getConteudo();//retorna o tipo generico e pega o conteudo
    }

   //Método getNo, utilizado em outros métodos
    private NoDuplo<T> getNo(int index){//método interno que retrona um no duplo
        NoDuplo<T> noAuxiliar = primeiroNo; //corre os nós da estrutura de dados
        //duas condições:
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size(){
        return tamanhoLista;
    }

    //Método toString
    public String toString() {
        String strRetorno = "";//declarando a string
        NoDuplo<T> noAuxiliar = primeiroNo; //vamos imprimir pelo primeiro nó
        for(int i = 0; i < size(); i++){ //correndo a lista
        	//string de retorno:
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();//vamos ate o ultimo
        }
        strRetorno += "null";
        return strRetorno;
    }
}
