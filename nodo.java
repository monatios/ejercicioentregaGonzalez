public class nodo {
	private int info;
	private nodo sig;
	
	public nodo(){
		info=-1;
		sig=null;
	}
	public nodo(int in, nodo nex){
		setInfo(in);
		setNext(nex);
	}
	public void setInfo(int o){
		info = o;
	}
	public void setNext(nodo n){
		sig=n;
	}
	public int getInfo(){
		return info;
	}
	public nodo getNext(){
		return sig;
	}

}
