package BaseDemo;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		
		for(int i =0;i<arr.length-1;i++) { //�������
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) { //�M���U�@�Ӥ�j�p
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
//				�Y�e�Ƥj���ƫh�洫�A�O�ҫe�Ƥp����(�ɧ�)
//				�Y�e�Ƥp���ƫh�洫�A�O�ҫe�Ƥj����(����)
			}
		}
		
		System.out.println("�Ƨǫ�:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
