public class Main {

	public static void main(String[] args) {
		
		int info;
		myList list1= new myList();
		myList list2= new myList();
		myList result= new myList();
		
		
		//ejemplo de dos listas ordenadas 
		System.out.println("lista ordenada");
		info =2;
		myList list3= new myList();
		list3.insert(info);
		info=4;
		list3.insert(info);
		info= 8;
		list3.insert(info);
		list3.print();
		System.out.println("---");
		myList list4 =new myList();
		info =4;
		list4.insert(info);
		info =8;
		list4.insert(info);
		info=9;
		list4.insert(info);
		list4.print();
		System.out.println("---");
		myList result2 = new myList();
		comparadorDeListas(list4, list3, result2);
		result2.print();
		System.out.println("---");
		//para medir el tiempo de ejecucion
		CargarListaconCantElemRandom(list1,10);
		System.out.println("cargar lista");
		list1.print();
		System.out.println("---");
		CargarListaconCantElemRandom(list2,10);
		list2.print();
		System.out.println("---");
		comparadorDeListas(list1, list2, result);
		result.print();
		System.out.println("---");
		
	}
	//inicio de metodos
	public static void insertOrd(myList result, int valor){

		if(result.getFirst()==null){
			result.insert(valor);
			
		}else{
			Node cursor = result.getFirst();
				if((int)cursor.getInfo()>=valor){
					result.insert(valor);
				}else{
					Node aux = new Node(valor,null);
					while(cursor.getNext()!=null && (int)cursor.getNext().getInfo()>valor){
						cursor=cursor.getNext();
					}
					if(cursor.getNext()==null){
						cursor.setNext(aux);
					}else{
						aux.setNext(cursor.getNext());
						cursor.setNext(aux);
					}
					
				}
			
		}
		
	
		
		
		
	}
public static void comparadorDeListas(myList l1, myList l2, myList result){
Node cursor1 = l1.getFirst();

		while(cursor1!=null){
			if(l2.search(cursor1.getInfo())){
				int valor =(int)cursor1.getInfo();
				if(!result.search(cursor1.getInfo())){
					insertOrd(result,valor);
				}
				cursor1=cursor1.getNext();
				
			}else{
				cursor1=cursor1.getNext();
			}
		}
	}

public static void CargarListaconCantElemRandom(myList list, int cantElem){
	int cont=0;
	while(cont<cantElem){
		int valor = (int) (Math.random() * 20) + 1;
		list.insert(valor);
		cont++;
	}
}
	

}
