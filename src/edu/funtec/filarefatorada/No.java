package edu.funtec.filarefatorada;



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
		
}
