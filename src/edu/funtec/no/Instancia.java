package edu.funtec.no;

public class Instancia {

	public static void main(String[] args) {
		
		
		No no1 = new No("conteudo no1");
		No no2 = new No("conteudo no2");
		
		no1.setProximo(no2);
		
		No no3 =  new No("conteudo no3");
		no2.setProximo(no3);
		
		No no4 = new No("conteúdo no4");
		no3.setProximo(no4);
		
		//aqui temo no1, apontando para no2, e no2 apontando no3...
		
		System.out.println(no1);
		System.out.println(no1.getProximo());
		System.out.println(no2);
		
		System.out.println("-----------------");
		
		System.out.println(no1);
		System.out.println(no1.getProximo());
		System.out.println(no1.getProximo().getProximo());
		System.out.println(no1.getProximo().getProximo().getProximo());
		System.out.println(no1.getProximo().getProximo().getProximo().getProximo());
	
	}

 // esse é o conceito de encadeamento.
}
