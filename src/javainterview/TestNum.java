package javainterview;

public class TestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1000;
		int y=1000;
		if(x==y) {
			System.out.println("both are equal");
		}else
		{
			System.out.println("both are not equal");
		}
		System.out.println("intCaching");
		intCaching();
		

	}
	//range--> -128 to 127
	public static void intCaching() {
		Integer num1=130;
		Integer num2=130;
		if(num1==num2) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		
	}

}
