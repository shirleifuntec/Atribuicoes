package edu.funtec.models;

public class AtribuicaoOjbeto {

	Integer num;
	
	public AtribuicaoOjbeto(Integer num) {
		this.num = num;
	}
	
	public void setNum(Integer num) {
		this.num = num;
		
	}
	
	public String toString() {
		return this.num.toString();
	}
}
