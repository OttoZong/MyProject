package Day03;

import java.util.Scanner;

public class factorial {
	public static void main(String arg[]) {
//		System.out.println(f(5));
		Wude();
	}

	// 遞歸函數
	public static int f(int n) {
		if (n == 1)// 终止条件
		{
			return 1;
		} else {
			return n * f(n - 1);
		}
	}

	public static void Wude() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入1~9之間的數字:");
		System.out.println("備註:超過10!會發生溢位");
		for (int n = scan.nextInt(); n >= 1; n--) {
			System.out.println(n + "!=" + f(n));
		}
	}

}
