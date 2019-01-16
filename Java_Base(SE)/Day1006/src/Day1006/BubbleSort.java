package Day1006;

import java.io.PrintStream;

public class BubbleSort
{
  public static void main(String[] args)
  {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++)
    {
      arr[i] = ((int)(Math.random() * 100.0D));
      System.out.println(arr[i]);
    }
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[(j + 1)])
        {
          int t = arr[j];
          arr[j] = arr[(j + 1)];
          arr[(j + 1)] = t;
        }
      }
    }
    System.out.println("排序後:");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
