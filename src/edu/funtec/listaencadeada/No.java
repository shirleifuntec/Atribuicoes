package edu.funtec.listaencadeada;

public class No<T> { //conteudo generico

    private T conteudo;
    private No proximoNo;

    //contrutor vazio
  public No() {
	  this.proximoNo = null;
	  
  }
    //contrutor passadno somente o conteudo
    public No(T conteudo){
    	 this.proximoNo = null;
        this.conteudo = conteudo;
    }

    
    
    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    
    public T getConteudo() {
        return conteudo;
    }
 
    
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    //metodo to String
    //so mostra o conteudo
    public String toString() {
        return "No{" + conteudo + '}';
    }

    //metodo to String personalizado
    public String toStringEncadeado() {
        String str = "No{" + conteudo + "}";

        if(proximoNo != null){//testando se o proximo nó é diferente de nulo
            str += "->" + proximoNo.toString();//concatenado com a string de retorno
        }else{
            str += "->null";
        }
        return str;
    }

}
