package javainterview;

import java.util.ArrayList;

public class arraylistDemo {

	public static void main(String[] args) {
		ArrayList <Integer>ar=new ArrayList<Integer>();
		ar.add(0,12);
		ar.add(1,24);
		ar.add(2,48);
		ar.add(3,36);
		System.out.println(ar);
		ar.add(0,20);
		System.out.println(ar);
		ar.remove(0);
		System.out.println(ar);
		ar.add(2,56);
		ar.set(0, 00);
		System.out.println(ar);
	}

}
