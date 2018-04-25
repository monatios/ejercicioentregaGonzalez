
public class lista {
	protected nodo inic,fin;
	protected int size;

		public lista(){
			inic =null;
			fin = null;
			size=0;
		}
		
		public int getsize(){
			return size;
		}
		
		public boolean isEmpty(){
			return inic==null;
		}
		
		public nodo getFirst() {
			return inic;
		}
		
		public nodo getLast(){
			return fin;
		}
		
		public void insert(int n){
			nodo tmp= new nodo(n,null);
			if(inic==null){
				inic=tmp;
				fin = tmp;
				size++;
				
			}else{
				fin.setNext(tmp);
				fin = tmp;
				size++;
				
			}
			
		}
		
		public boolean esOrdenada(){
			boolean condicion = true;
			nodo aux = inic;
			while(aux != null && condicion){
				if(aux.getNext()!= null){
					if(aux.getInfo()>aux.getNext().getInfo()){
						condicion = false;
					}
				}
				aux = aux.getNext();
			}
			
			return condicion;
		}
		
		public void print(){
			nodo tmp = inic;
			while (tmp != null){
				System.out.print(tmp.getInfo());
				tmp=tmp.getNext();
				
			}
		}
		
		public boolean buscar(int ref){
			nodo aux = inic;
			boolean encontrado = false;
				while(aux!=null && encontrado != true){
					if(ref == aux.getInfo()){
						encontrado=true;
					}else{
						aux=aux.getNext();
					}
				}
			
			
			return encontrado;
			
		}
		
		public void inserOrd(int valor){
			nodo aux = new nodo(valor,null);
			if(this.getFirst()==null){
				this.insert(valor);
				
			}else{
				
					if(inic.getInfo()>=valor){
						aux.setNext(inic);
						inic=aux;
					}else{
						nodo cursor = this.getFirst();
						while(cursor.getNext()!=null && cursor.getNext().getInfo()<valor){
							cursor=cursor.getNext();
						}
						if(cursor.getNext()==null){
							this.insert(valor);
						}else{
							aux.setNext(cursor.getNext());
							cursor.setNext(aux);
						}
						
					}
		}
		
		
		}
		public  lista getComunes( lista acompara){
			lista result = new lista();
			nodo cursor1 = inic;
				if(this.esOrdenada() && acompara.esOrdenada()){
					System.out.println("ordenada");
					while(cursor1 != null){
						if(acompara.buscar(cursor1.getInfo())){
							result.insert(cursor1.getInfo());
						}
						cursor1= cursor1.getNext();
					} 
				}else{
					System.out.println("desordenado");
					while(cursor1 != null){
						if(acompara.buscar(cursor1.getInfo())){
							result.inserOrd(cursor1.getInfo());
						}
						cursor1= cursor1.getNext();
					}
				}	
					return result;
				
		}

}
