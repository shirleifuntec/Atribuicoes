package edu.funtec.pilhas;

public class Pilha {
	
	 No refNoEntradaPilha = null; //o nó de referencia.

	//Acrescenta um nó no topo da pilha, empilha
	 
	 public void push(No novoNo){//acrescenta um novo nó
	        No refAuxiliar = refNoEntradaPilha; //guarda a referencia de entrada
	        refNoEntradaPilha = novoNo;//o primeiro nó da pilha
	        refNoEntradaPilha.setRefNo(refAuxiliar);//aqui seto a ref de entrada para o primeiro objeto da pilha
	    }

	    public No pop(){
	        if(!isEmpty()){//primeiro verifico se minha classe esta vazia
	            No noPoped = refNoEntradaPilha; //o nó que foi retirado e  o no que ireir retornar
	            refNoEntradaPilha = refNoEntradaPilha.getRefNo(); //recebe o proximo nó
	            return noPoped;
	        }
	        return null;
	    }

	    public No top(){ //retorna a referência
	        return refNoEntradaPilha;
	    }

	    public boolean isEmpty(){ //retorna se esta nulo ou não
	        return refNoEntradaPilha == null ? true : false;
	    }

	   // Implementando o toString
	    public String toString() {
	        String stringRetorno = "------------\n";
	        stringRetorno += "   Pilha\n";
	        stringRetorno += "------------\n";
	        No noAuxiliar = refNoEntradaPilha; // capturamos a entrada de referncia
	        while(true){
	            if(noAuxiliar != null){ //nó auxiliar é diferente de nulo?
	                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n"; //string de retorno concatenada ai nó
	                noAuxiliar = noAuxiliar.getRefNo();//o no auxiliar é o no que esta abaixo, próximo nó.
	            }else{
	                break;
	            }
	        }
	        stringRetorno += "============";
	        return stringRetorno;
	    }
	}


