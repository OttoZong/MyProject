
//2.求多個數的最大公因數，ex. 15  19  27 找出最大公因數
public class arithmetic {
	public static int gcd(int a, int b, int c) {

		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
			while (c != 0) {
				temp = a % c;
				a = c;
				c = temp;
			}
		}

		return a;

	}
	
//1.給兩個數(10, 23)，找出這中間的質數..

	public static void prime(int m, int n) {
		
		for(int i=1;i<=m;i++){

			if(m%i==0 && n%i==0){
				System.out.println(i);


			}

		}
		
	}
	public static void main(String[] args) {
		System.out.println(gcd(11, 33, 88));
//		prime(10, 25);
	}

}
