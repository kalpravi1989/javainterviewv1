package javainterview;

public class LargeAndSmallNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array=new int[5];
		array[0]=25;
		array[1]=30;
		array[2]=49;
		array[3]=12;
		array[4]=-10;
		int large=array[0];
		int small=array[0];
		for(int i=1;i<5;i++) {
			if(array[i]>large) {
				large=array[i];
			}
			else if(array[i]<small) {
				small=array[i];
			}
			
		}
	  System.out.println("largest number array is"+large);
	  System.out.println("smallest number array is"+small);
	}
	

}
