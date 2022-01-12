package javainterview;

public class CalByValueAndCalByRef {

	int p;
	int q;
	public static void main(String[] args) {
		CalByValueAndCalByRef obj=new CalByValueAndCalByRef();
		int x=10;
		int y=20;
		obj.calByValSwap(x,y);
		System.out.println(x +" "+ y);
		obj.p=30;
		obj.q=40;
		obj.calByRefSwap(obj);
		System.out.println(obj.p+"  "+obj.q);

	}
	public void calByValSwap(int a,int b) {
		int c= a;
		 a= b;
		 b=c;
		 
	}
	public void calByRefSwap(CalByValueAndCalByRef t) {
		int temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}

}
