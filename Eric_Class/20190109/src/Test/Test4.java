package Test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 傳入數字陣列(56,32,67,62,66,61,75,49,32,56),方法不限定做遞增排序輸出.
 * 
 * @author Otto
 *
 */
public class Test4 {
	
	public static void main(String[] args) {
//		int arr[] = new int[]{56,32,67,62,66,61,75,49,32,56};
		int arr[] = {56,32,67,62,66,61,75,49,32,56};
		for(int i =0; i<arr.length-1 ;i++) { //控制輪數
			for(int j=0; j<arr.length-1-i ;j++) {
				
				if(arr[j]>arr[j+1]) { //和它下一個比大小
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
//				若前數大於後數則交換，保證前數小於後數(升序)
//				若前數小於後數則交換，保證前數大於後數(降序)
			}
		}
		Deque<Integer> de_que = new ArrayDeque<Integer>(); 
		System.out.println("排序後:");

		for(int i=0;i<arr.length;i++) {	
			de_que.add(arr[i]);
		
			
			
		}	
		System.out.print(de_que);
	}

}
