package edu.funtec.filas;

public class No {
	
	
	private Object object; //conteúdo do Nó
	//um objeto do java que engloba todos os objetos.
	//todos objetos do java herdam dele.
	
	private No refNo;
	
	//Construtor
	public No(Object object) {
		this.refNo = null; //garantindo que é = nulo
		this.object = object;
	}
	
	
	//contrutor padrão
	public No() {
			}


	public Object getObject() {
		return object;
	}


	public void setObject(Object object) {
		this.object = object;
	}


	public No getRefNo() {
		return refNo;
	}


	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}


	//toString
	public String toString() {
		return "No [object=" + object + "]";
	}
	
	
	
	
	
	
	
    /*private No refNoEntradaFila = null;

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No dequeue(){
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true){
              if(primeiroNo.getRefNo() != null) {
                  noAuxiliar = primeiroNo;
                  primeiroNo = primeiroNo.getRefNo();
              }else{
                  noAuxiliar.setRefNo(null);
                  break;
              }
            }
            return primeiroNo;
        }
        return null;
    }

    public No first(){
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto="+ noAuxiliar.getObject() +"}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }*/
}
