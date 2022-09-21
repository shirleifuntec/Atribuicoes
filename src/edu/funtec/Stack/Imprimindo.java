package edu.funtec.Stack;

import java.util.Stack;

public class Imprimindo {

    public static void main(String args[]){

        Stack<Carro> stackCarros = new Stack<>();


        //chamnado o método push
        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        
        //retirando o carro do topo da pilja
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        
        //metodo peek mostra, mas não retira
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());

    }

}
