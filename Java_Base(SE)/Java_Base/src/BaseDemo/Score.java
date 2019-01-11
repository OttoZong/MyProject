package BaseDemo;

import java.util.Scanner;

public class Score {
//	成績判斷
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入成績");
		int score = scan.nextInt();

		if (score >= 0 && score <= 100) { // 合法

			if (score >= 90) {
				System.out.println("A-優秀");
			} else if (score >= 80) {
				System.out.println("B-良好");
			} else if (score >= 60) {
				System.out.println("C-中等");
			} else {
				System.out.println("D-不及格");
			}
		} else { // 不合法
			System.out.println("數據不符合範圍");
		}

	}

}
