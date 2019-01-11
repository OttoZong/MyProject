package BaseDemo;
import java.util.Scanner;

public class Cashier {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入單價");
		double unitPrice = scan.nextDouble();
		System.out.println("請輸入數量");
		double amount = scan.nextDouble();
		System.out.print("請輸入金額");
		double money = scan.nextDouble();
		
		//計算總價(單價*數量)
		double totalPrice = unitPrice * amount;
		if(totalPrice>=500) { //滿500
			totalPrice *= 0.8;  //打八折
		}
		if(money>=totalPrice) { //錢夠
			//計算找零(給的錢-總價)
			double change = money- totalPrice;
			System.out.println("總價為"+totalPrice+"，找零為:"+change);
		}else {
			System.out.println("Error，差額為:"+(totalPrice-money));
		}
		
		
		
		
		
	}

}
