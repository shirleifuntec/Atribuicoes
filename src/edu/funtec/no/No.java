package edu.funtec.no;

public class No {
	
	private String conteudo;
	private No proximo;
	
	//contrutor
	public No(String conteudo) {
		this.proximo = null;
		this.conteudo =  conteudo;
		
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "nó { " +
	"conteudo " + conteudo + "   }";
	}

	
	
}
