package BaseDemo;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		
		for(int i =0;i<arr.length-1;i++) { //北近计
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) { //㎝ウゑ
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
//				璝玡计计玥ユ传玂靡玡计计(ど)
//				璝玡计计玥ユ传玂靡玡计计()
			}
		}
		
		System.out.println("逼:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
