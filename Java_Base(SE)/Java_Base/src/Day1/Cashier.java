package Day1;

import java.util.Scanner;

public class Cashier {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入單價");
		double unitPrice= scan.nextDouble();
		System.out.println("請輸入數量");
		double amount = scan.nextDouble();
		System.out.println("請輸入金額");
		double money = scan.nextDouble();
		
		double total = unitPrice * amount;
		if(total>=500) {
			total*= 0.8;
		}
		if(money>=total) {
			double change= money-total;
			System.out.println("總價為"+total+"，找零為:"+change);
		}else {
			System.out.println("Error，差額為:"+(total-money));
		}

	}

}
