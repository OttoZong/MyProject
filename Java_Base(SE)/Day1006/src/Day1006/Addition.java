package Day1006;

import java.io.PrintStream;
import java.util.Scanner;

public class Addition
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int score = 0;
    for (int i = 0; i < 10; i++)
    {
      int a = (int)(Math.random() * 100.0D);
      int b = (int)(Math.random() * 100.0D);
      int result = a + b;
      System.out.println("(" + i + ")" + a + "+" + b);
      
      System.out.println("算吧!");
      int answer = scan.nextInt();
      if (answer == -1) {
        break;
      }
      if (answer == result)
      {
        score += 10;
        System.out.println("答對了");
      }
      else
      {
        System.out.println("答錯了");
      }
    }
    System.out.println("總分為:" + score);
  }
}
