package BaseDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		//1.數組的複製:
		int[] a = {10,20,30,40,50};
		int[] a1 = new int[6]; //0,0,0,0,0
//		a:源數組
//		1:源數組的起始下標
//		a1:目標數組
//		0:目標數組的起始下標
//		4:要複製的元素個數
		
		System.arraycopy(a,1,a1,0,4);
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}

	}

}
