package javainterview;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=s.nextLine();
		revStringUsingForloop(str);
		System.out.println(str);
		//revStringUsingStringBuffer(str);
		
	}
	public static void revStringUsingForloop(String str){
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("given word is palindrome");
		}else
		{
			System.out.println("given word is not a palindrome");
		}
		
	}
	public static void revStringUsingStringBuffer(String str) {
		StringBuffer sbr=new StringBuffer(str);
		System.out.println(sbr.reverse());
		
		
	}

}
