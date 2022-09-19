package edu.funtec.pilhas;

public class No {

	
	   private int dado;
	   private No refNo = null;

	    public No() {//construtor vazio
	    }

	    public No(int dado) { //construtor para passar o dado
	        this.dado = dado;
	    }

	    public int getDado() {
	        return dado;
	    }

	    public void setDado(int dado) {
	        this.dado = dado;
	    }

	    public No getRefNo() {
	        return refNo;
	    }

	    public void setRefNo(No refNo) {
	        this.refNo = refNo;
	    }

	   //metodo, não mostraremos a ref de nó
	    public String toString() {
	        return "No{" +
	                "dado=" + dado +
	                '}';
	    }
}
