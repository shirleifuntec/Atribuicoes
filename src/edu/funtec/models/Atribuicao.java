package edu.funtec.models;

public class Atribuicao {
	public static void main(String[] args) {
	int intA = 1;
	int intB = intA;
	
	System.out.println(intA + "=" + intB);
	intA = 2;
	System.out.println(intA + "=" + intB);
		
	
	AtribuicaoOjbeto objetoA = new AtribuicaoOjbeto(1);
	AtribuicaoOjbeto objetoB = objetoA;
	System.out.println(objetoA + "=" + objetoB);	
	objetoA.setNum(2); // aqui copia a referencia de memoria do objeto A
	System.out.println(objetoA + "=" + objetoB);	

	}

}
