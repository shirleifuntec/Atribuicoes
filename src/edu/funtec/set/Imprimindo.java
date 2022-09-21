package edu.funtec.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Imprimindo {

    public static void main(String args[]){
    	
    	//criando conjunto de carro
        Set<Carro> hashSetCarros = new HashSet<>();

       //digitamos fora de ordem
        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(hashSetCarros);

        //implementando a arvore, 
        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        //exibe em ordem 
        System.out.println(treeSetCarros);

    }

}