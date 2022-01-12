package javainterview;

import java.util.ArrayList;

public class ArralistDemo {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(30);
		ar.add("name");
		ar.add(23.45);
		ar.add('b');
		//System.out.println(ar.size());
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		System.out.println("for-loop diff");
		for(Object o:ar) {
			System.out.println(ar);
			break;
		}
		
	}

}
