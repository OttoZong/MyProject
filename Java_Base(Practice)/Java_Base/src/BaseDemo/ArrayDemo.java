package BaseDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		//1.�Ʋժ��ƻs:
		int[] a = {10,20,30,40,50};
		int[] a1 = new int[6]; //0,0,0,0,0
//		a:���Ʋ�
//		1:���Ʋժ��_�l�U��
//		a1:�ؼмƲ�
//		0:�ؼмƲժ��_�l�U��
//		4:�n�ƻs�������Ӽ�
		
		System.arraycopy(a,1,a1,0,4);
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}

	}

}
