public class myList {
	protected Node first;
	protected int size;

		public myList(){
			first =null;
			size=0;
		}
		
		public int getsize(){
			return size;
		}
		
		public boolean isEmpty(){
			return first==null;
		}
		
		public Node getFirst() {
			return first;
		}
		
		public void insert(Object o){
			Node tmp= new Node(o,null);
			tmp.setNext(first);
			first=tmp;
			size++;
		}
		
		public void print(){
			Node tmp = new Node();
			tmp =first;
			int max = getsize();
			int p=0;
			while (p<max){
				System.out.println(tmp.getInfo());
				tmp=tmp.getNext();
				p++;
			}
		}
		
		public boolean search(Object ref){
			Node aux = first;
			boolean find = false;
				while(aux!=null && find != true){
					if(ref == aux.getInfo()){
						find=true;
					}else{
						aux=aux.getNext();
					}
				}
			
			
			return find;
			
		}
}
