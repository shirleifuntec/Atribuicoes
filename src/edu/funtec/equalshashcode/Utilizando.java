package edu.funtec.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Utilizando {

    public static void main(String[] args){

       //lista carro
    	List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        //testando se existe ford na nossa lista, o contains utiliza o medodo equals e hash
        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford").hashCode());
        
        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        
        //comparando se carro 1 é igual a carro 2
        System.out.println(carro1.equals(carro2));
    }}