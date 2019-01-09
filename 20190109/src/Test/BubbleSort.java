
package Test;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		
		for(int i =0;i<arr.length-1;i++) { //控制輪數
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) { //和它下一個比大小
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
//				若前數大於後數則交換，保證前數小於後數(升序)
//				若前數小於後數則交換，保證前數大於後數(降序)
			}
		}
		
		System.out.println("排序後:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}