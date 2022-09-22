package edu.funtec.arvore;

//tipo generico e o comparable
public class BinNo<T extends Comparable<T>> {

   
	//referncias no esquerda e nó direita
	private T conteudo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        noEsq = noDir = null;//os dois nó começam com nulo
    }

    public BinNo() {//constutor simples
    }

    //metodos get
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    @Override //tostring
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
