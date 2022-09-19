package edu.funtec.filarefatorada;

import edu.funtec.filas.No;

public class Fila {

    //referencia de entrada na fila
	private No refNoEntradaFila;
	
	//construtor
	public Fila() {
		this.refNoEntradaFila = null;
	}

   // public void enqueue(No novoNo){ 
	public void enqueue (Object obj) {//chamo o objeto
       No novoNo = new No(obj); // embutindo o no na classe fila
		novoNo.setRefNo(refNoEntradaFila); //seta o novo nó como entrada de referencia na fila
        refNoEntradaFila = novoNo; // a referncia de entrada passa ser o novo nó
    } 

    public Object dequeue(){
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila; //pega o nó após o primeiro (n-1)
            while(true){
              if(primeiroNo.getRefNo() != null) {
                  noAuxiliar = primeiroNo;//temos que guardar o no posterior
                  primeiroNo = primeiroNo.getRefNo();//aqui o pirmeiro nó
              }else{
                  noAuxiliar.setRefNo(null);// seta o segundo nó 
                  break;
              }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    //método first, mais complexo que os demais,
    //e retorna o primeiro que entrou na fila
    public Object first(){
        if(!isEmpty()){//testar se a fila não esta vazia
           //criando um nó auxiliar, que retorna a referncia de entrada da fila
        	No primeiroNo = refNoEntradaFila;
            //percorrer nó por nó ate encontrar o primeiro
        	while(true){
        		//referncia de entrada com a referncia do proximo nó e testa se esta diferente de null
        		//se estiver diferente de nulo, existe outro nó a frente dele.
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";//cria a string de retorno pra retornar no final
        No noAuxiliar = refNoEntradaFila; //declarando o no auxiliar, que imprime cada nó

        if(refNoEntradaFila != null){ //fila nao vazia
            while(true){
            	
            	//contruindo nossa string de retorno
                stringRetorno += "[No{objeto="+ noAuxiliar.getObject() +"}]--->";
                if(noAuxiliar.getRefNo() != null){//testando se existe só um elemnento na fila
                    noAuxiliar = noAuxiliar.getRefNo();//proximo nó
                }else{
                    stringRetorno += "null";//primiro no da fila ponta para null
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}

