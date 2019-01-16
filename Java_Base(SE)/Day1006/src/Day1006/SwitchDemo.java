package Day1006;

import java.io.PrintStream;
import java.util.Scanner;

public class SwitchDemo
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("請輸入命令:1.顯示所有紀錄 2.查詢登入紀錄 0.退出");
    int command = scan.nextInt();
    switch (command)
    {
    case 1: 
      System.out.println("顯示全部記錄");
      break;
    case 2: 
      System.out.println("查詢登入紀錄");
      break;
    case 0: 
      System.out.println("現在已退出");
      break;
    default: 
      System.out.println("輸入錯誤，請重新輸入");
    }
  }
}
