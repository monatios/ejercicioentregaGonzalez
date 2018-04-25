public class Main {
		
		public static void main(String[] args) {
		lista l1 = new lista();
		lista l2 = new lista();
		l1.insert(1);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		l1.insert(7);
		l1.print();
		System.out.println();
		l2.insert(2);
		l2.insert(3);
		l2.insert(4);
		l2.insert(7);
		l2.print();
		System.out.println();
		lista result1 = l1.getComunes(l2);
		result1.print();
		System.out.println();
		
		lista l3 = new lista();
		lista l4 =new lista();
		l3.insert(10);
		l3.insert(8);
		l3.insert(9);
		l3.insert(13);
		
		l3.print();
		System.out.println();
		l4.insert(9);
		l4.insert(8);
		l4.insert(10);
		l4.insert(5);
		
		l4.print();
		System.out.println();
		lista result2 = l3.getComunes(l4);
		result2.print();


	}

}
