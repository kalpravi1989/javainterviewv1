package javainterview;

import java.util.LinkedList;

public class linkedlistdemo {

	public static void main(String[] args) {
		LinkedList <Integer>ll= new LinkedList<Integer>();
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		ll.set(0, 50);
		System.out.println(ll);
		ll.addFirst(90);
		ll.addLast(80);
		System.out.println(ll);
		ll.set(3,44);
		System.out.println(ll.size());
		System.out.println(ll);
		ll.remove(4);
		System.out.println(ll);
		System.out.println(ll.size());
		
		
	}

}
