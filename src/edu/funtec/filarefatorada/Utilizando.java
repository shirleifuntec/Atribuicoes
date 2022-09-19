package edu.funtec.filarefatorada;

import edu.funtec.filas.Fila;
import edu.funtec.filas.No;

public class Utilizando {

	public static void main(String[] args) {
		
		//instanciar a fila
			        Fila minhaFila = new Fila();

			        //enfileirando
			        minhaFila.enqueue(new No("primeiro"));
			        minhaFila.enqueue(new No("segundo"));
			        minhaFila.enqueue(new No("terceiro"));
			        minhaFila.enqueue(new No("quarto"));

			        System.out.println(minhaFila); //ver a fila

			        
			       //chamar o método dequeue  
			       System.out.println(minhaFila.dequeue());

			        System.out.println(minhaFila);

			       //incluindo
			        minhaFila.enqueue(new No("ultimo"));

			        System.out.println(minhaFila);

			        //utilizando método first
			        System.out.println(minhaFila.first());

			        System.out.println(minhaFila);
			    }
			}
}
