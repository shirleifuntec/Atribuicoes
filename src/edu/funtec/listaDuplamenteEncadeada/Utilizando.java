package edu.funtec.listaDuplamenteEncadeada;

public class Utilizando {
	public static void main(String args[]){

       
		//decalrar  a lista do tipo string
		ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

        
		//Criando os nós
		minhaListaEncadeada.add("c1");
        minhaListaEncadeada.add("c2");
        minhaListaEncadeada.add("c3");
        minhaListaEncadeada.add("c4");
        minhaListaEncadeada.add("c5");
        minhaListaEncadeada.add("c6");
        minhaListaEncadeada.add("c7");

        //imprime a lista
        System.out.println(minhaListaEncadeada);

        //removendo o indice 3
        minhaListaEncadeada.remove(3);
        
        //adicionando no indice 3
        minhaListaEncadeada.add(3, "99");

        System.out.println(minhaListaEncadeada);
        
        //imprimindo o indice 3
        System.out.println(minhaListaEncadeada.get(3));
    }
}


