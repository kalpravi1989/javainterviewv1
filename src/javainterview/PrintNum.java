package javainterview;

import java.util.stream.IntStream;

public class PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printNumWithoutLoop();
		//printNum(5,75);
		//IntStream.range(1, 101).forEach(e -> System.out.println(e));
		printWord();
		}

	

   public static void printnumWithoutNum() {
	   int x='a'/'a';
		String str="**********";
		for(int i=x;i<=(str.length()*str.length());i++) {
			System.out.println(i);
		}
   }
   public static void PrintnumWithoutNum2() {
	   int x='a'/'a';
	   for(int i=x;i<='d';i++) {
			System.out.println(i);
}
}
   //recursive method-1
   public static void printNumWithoutLoop() {
	   int x=1;
	   printresursive(x);
   }
   public static void printresursive(int x) {
	  if(x<=100) {
	   System.out.println(x);
	   x++;
	   printresursive(x);
   }
   }
   //recursive method-2
   public static void printNum(int stnum,int endnum) {
	   if(stnum<=endnum) {
		   System.out.println(stnum);
		   stnum++;
		   printNum(stnum,endnum);
		   
	   }
   }
   //print word without using semicolon
   public static void printWord() {
	   if(System.out.printf("hello world"+"\n")==null) {
		   
	   }
	   if(System.out.append("hello world"+"\n")==null) {
		   
	   }
	   if(System.out.append("hello world"+"\n").equals(null)) {
		   
	   }
	   for(int i=0;i<1;System.out.print("hello world")) {
		   i++;
	   }
   }
   
   
}