package edu.funtec.listaencadeada;

public class Utilizando {
	   public static void main(String args[]){

	        //declarar nossa lista de String
		   ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

	       //adicionando as string
		   minhaListaEncadeada.add("teste1");
	        minhaListaEncadeada.add("teste2");
	        minhaListaEncadeada.add("teste3");
	        minhaListaEncadeada.add("teste4");

	        System.out.println(minhaListaEncadeada.get(0));//indice 0, retrona o teste 1
	        System.out.println(minhaListaEncadeada.get(1));
	        System.out.println(minhaListaEncadeada.get(2));
	        System.out.println(minhaListaEncadeada.get(3));

	        System.out.println(minhaListaEncadeada);//aqui chama o metodo Tostring

	        minhaListaEncadeada.remove(3);//removendo o indice 3

	        System.out.println(minhaListaEncadeada);



	    }
}
