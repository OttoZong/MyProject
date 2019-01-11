package AbstractDemo;

/* ���W : Salary.java */

//���ާڭ̤����ҤƤ@��Employee������H�A���O�p�G�ڭ̹�ҤƤ@��Salary����H�A
//�ӹ�H�N�qEmployee ���~��7�Ӧ�����k�A�B�q�L�Ӥ�k�i�H�]�m������T�Ӧ����ܶq�C
public class Salary extends Employee
{
   private double salary; //Annual salary
   public Salary(String name, String address, int number, double
      salary)
   {
       super(name, address, number);
       setSalary(salary);
   }
   public void mailCheck()
   {
       System.out.println("Within mailCheck of Salary class ");
       System.out.println("Mailing check to " + getName()
       + " with salary " + salary);
   }
   public double getSalary()
   {
       return salary;
   }
   public void setSalary(double newSalary)
   {
       if(newSalary >= 0.0)
       {
          salary = newSalary;
       }
   }
   public double computePay()
   {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
}
