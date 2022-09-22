package edu.funtec.arvore;

//generic e implementa compatrable
public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz; //seta raiz como nulo

    
    public ArvoreBinaria(){
        this.raiz = null;
    }

    //método inserir que expoe e recebe o conteudo
    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);//novo nó recebe o conteudo
        raiz = inserir(raiz, novoNo);//recebe o metodo privado
    }

    //metodo inserir privado que realmente insere
    //recebe o no atual e o novo nó
    //vai verificar o nó ate chegar no nó da inserção
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if(atual == null){//siginifica q estou na raiz
            return novoNo;//seta novo nó como raiz
            
            //condição de comparação se o conteudo do novo nó é menor que o nó atual
            //como exendemos de comparable preciso ter o compareTo
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));//menor vai pra esquerda
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));//maior vai pra direita
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);//chama o metodo privado e exibe pela raiz
    }

    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());//visita esaquerda
            System.out.print(atual.getConteudo() + ", ");//exibe o atual
            exibirInOrdem(atual.getNoDir());//visita direita
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);//chama o privado
    }

    //exibe depois de visitar
    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){//testa se o atual esta nulo
            exibirPosOrdem(atual.getNoEsq());//exibe primeiro
            exibirPosOrdem(atual.getNoDir());//exibe primeiro
            System.out.print(atual.getConteudo() + ", ");//mostra
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }
//primeiro exibe
    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    public void remover(T conteudo){//recebe conteudo de tipo generico
    	//pra verificar se tem o conteudo
    	try{ 
              	
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

           //percorre a arvore para trazer o conteudo
            //enquanto o atual não for nulo vai percorrendo
            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){// verifica se o no que eu quero remover é menor ou menor
                    atual = atual.getNoEsq();//se for menor vai pra esquerda
                }else {
                    atual = atual.getNoDir();
                    //qdo eu chegar no no que quero remover ele sai do loop
                }
            }

            if(atual == null){// se eu não encontrar ninguem
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            
           // ate aqui recebemos o conteudo, declaramos os nós auxiliares,e localizamos o conteudo
            //e verificamos se a raiz é nula
            
            //aqui se a raiz não for nula, e se encontramos o conteudo do que queremos remover
           //testando várias coisas
            if(pai == null){
                if(atual.getNoDir() == null){
                	this.raiz = atual.getNoEsq();// se o meu da direita é nulo, tenhoq pegar da esquerda
                }else if(atual.getNoEsq() == null){//contrario de acima
                    this.raiz = atual.getNoDir();
                }else {
                	//etapa do remove onde removemos e colocamos o nos da direita ou da esquerda no local
                	//no atual eo filho nó a esquerda
                    for(temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoEsq()//incremento do for
                    ){
                        if(filho != atual.getNoEsq()){//se filho for diferente de atual
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
                //correndo pela arvore
            }else if(atual.getNoDir() == null){//se o no da direita for nulo
                if(pai.getNoEsq() == atual){//verifica se o esquerda é igula ao atual
                    pai.setNoEsq(atual.getNoEsq());
                }else {
                    pai.setNoDir(atual.getNoEsq());
                }
                //caso a esquerda seja nulo
            }else if(atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else {
                    pai.setNoDir(atual.getNoDir());//aqui setamos o no a direita
                }
                
                //parte final do metodo remover
            }else{
                for(//laço for semelhante ao de cima
                        temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;//condição de parada
                        temp = filho, filho = filho.getNoDir()//condição de incremento
                ){
                    if(filho != atual.getNoEsq()){//diferente do atual, pega o esquerda
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());//este é o atual
                    }
                    filho.setNoDir(atual.getNoDir());//no dir é o atual
                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }
            }
        }catch (NullPointerException erro){//não encontrou o conteudo
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }

}
