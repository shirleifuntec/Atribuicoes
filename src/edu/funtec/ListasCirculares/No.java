package edu.funtec.ListasCirculares;


	public class No<T> {

	    private T conteudo;
	    private No<T> noProximo;//referencia de proximo nó

	    
	    //construtor
	    public No(T conteudo) {
	    	this.noProximo = null;
	        this.conteudo = conteudo;
	    }

	    public T getConteudo() {
	        return conteudo;
	    }

	    public void setConteudo(T conteudo) {
	        this.conteudo = conteudo;
	    }

	    public No<T> getNoProximo() {
	        return noProximo;
	    }

	    public void setNoProximo(No<T> noProximo) {
	        this.noProximo = noProximo;
	    }

	    //metodo ToString
	    public String toString() {
	        return "No{" +
	                "conteudo=" + conteudo +
	                '}';
	    }

}
