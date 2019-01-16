package Day1006;

import java.io.PrintStream;

public class Emp
{
  String name;
  int age;
  char gender;
  double salary;
  
  public void printInfo()
  {
    System.out.println("--------------------");
    System.out.println("姓名:" + this.name);
    System.out.println("年齡:" + this.age);
    System.out.println("性別:" + this.gender);
    System.out.println("薪水:" + this.salary);
  }
}
