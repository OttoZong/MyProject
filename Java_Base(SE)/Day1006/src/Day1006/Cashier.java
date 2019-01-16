package Day1006;

import java.io.PrintStream;
import java.util.Scanner;

public class Cashier
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("請輸入單價");
    double unitPrice = scan.nextDouble();
    System.out.println("請輸入數量");
    double amount = scan.nextDouble();
    System.out.print("請輸入金額");
    double money = scan.nextDouble();
    
    double totalPrice = unitPrice * amount;
    if (totalPrice >= 500.0D) {
      totalPrice *= 0.8D;
    }
    if (money >= totalPrice)
    {
      double change = money - totalPrice;
      System.out.println("總價為" + totalPrice + "，找零為:" + change);
    }
    else
    {
      System.out.println("Error，差額為:" + (totalPrice - money));
    }
  }
}
