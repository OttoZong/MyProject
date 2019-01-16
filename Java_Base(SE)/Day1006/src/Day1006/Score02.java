package Day1006;

import java.io.PrintStream;
import java.util.Scanner;

public class Score02
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int score = scan.nextInt();
    if ((score < 0) || (score > 100)) {
      System.out.println("輸入成績不在範圍裡");
    } else if (score >= 90) {
      System.out.println("A-優秀");
    } else if (score >= 80) {
      System.out.println("B-良好");
    } else if (score >= 60) {
      System.out.println("C-中等");
    } else {
      System.out.println("D-不及格");
    }
  }
}
