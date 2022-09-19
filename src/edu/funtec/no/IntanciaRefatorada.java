package edu.funtec.no;

public class IntanciaRefatorada {

	public static void main(String[] args) {
		
       //NoRefatorada<String> noRefatorada1 = new NoRefatorada<String>("Conteúdo no1");
       //não precisamos colocar como new string.
		//Tentar setar o conteúdo como string
        
		NoRefatorada<String> noRefatorada1 = new NoRefatorada<>("Conteúdo no1");
		NoRefatorada<String> noRefatorada2 = new NoRefatorada<>("Conteúdo no2");
        noRefatorada1.setProximoNo(noRefatorada2);

        NoRefatorada<String> noRefatorada3 = new NoRefatorada<>("Conteúdo no3");
        noRefatorada2.setProximoNo(noRefatorada3);

        NoRefatorada<String> noRefatorada4 = new NoRefatorada<>("Conteúdo no4");
        noRefatorada3.setProximoNo(noRefatorada4);

        System.out.println(noRefatorada1.toStringEncadeado());
        System.out.println(noRefatorada2.toStringEncadeado());
        System.out.println(noRefatorada3.toStringEncadeado());
        System.out.println(noRefatorada4.toStringEncadeado());
    }
	}

