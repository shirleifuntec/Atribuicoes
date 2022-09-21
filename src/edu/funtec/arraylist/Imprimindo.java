package edu.funtec.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Imprimindo {

    public static void main(String args[]){

        //lista carro
    	List<Carro> listCarros = new ArrayList<>();

        //adioconando carro
    	listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        //verifica se esxite o ford
        System.out.println(listCarros.contains(new Carro("Ford")));

        //busca o carro da possição/indice 2
        System.out.println(listCarros.get(2));

        //em qual indice esta o carro da fiat?
        System.out.println(listCarros.indexOf(new Carro("Fiat")));

        //remove
        System.out.println(listCarros.remove(2));

       System.out.println(listCarros);
    }

}