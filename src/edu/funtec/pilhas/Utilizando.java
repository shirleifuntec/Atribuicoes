package edu.funtec.pilhas;

public class Utilizando {

	    public static void main(String args[]){
	    	
	        Pilha minhaPilha = new Pilha();
	      //vamos empilhar os numeros
	       // minhaPilha.push(1)); não aceita, pq esta esperando um nó que contenha o numero inteiro
	        minhaPilha.push(new No(1));
	        minhaPilha.push(new No(2));
	        minhaPilha.push(new No(3));
	        minhaPilha.push(new No(4));
	        minhaPilha.push(new No(5));
	        minhaPilha.push(new No(6));
	        System.out.println(minhaPilha); //vai rodar o metodo toString

	        System.out.println(minhaPilha.pop());
	        System.out.println(minhaPilha);

	       minhaPilha.push(new No(99));
	        System.out.println(minhaPilha);
	    }
	}


