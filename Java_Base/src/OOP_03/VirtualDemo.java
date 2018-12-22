package OOP_03;

/* 文件名 : VirtualDemo.java */
public class VirtualDemo {
   public static void main(String [] args) {
      Salary s = new Salary("员工 A", "北京", 3, 3600.00);
      Employee e = new Salary("员工 B", "上海", 2, 2400.00);
      System.out.println("使用 Salary 的引用调用 mailCheck -- ");
      s.mailCheck();
      System.out.println("\n使用 Employee 的引用调用 mailCheck--");
      e.mailCheck();
    }
}

/*
 * 以上實例編譯運行結果如下：
 * 	Employee 构造函数
	Employee 构造函数
	使用 Salary 的引用调用 mailCheck -- 
	Salary 类的 mailCheck 方法 
	邮寄支票给：员工 A ，工资为：3600.0

	使用 Employee 的引用调用 mailCheck--
	Salary 类的 mailCheck 方法 
	邮寄支票给：员工 B ，工资为：2400.0*/

/*
 * 多態的實現方式
方式一：重寫：
	這個內容已經在上一章節詳細講過，就不再闡述，詳細可訪問：Java重寫(Override)與重載(Overload)。
方式二：接口
	1. 生活中的接口最具代表性的就是插座，例如一個三接頭的插頭都能接在三孔插座中，
	因為這個是每個國家都有各自規定的接口規則，有可能到國外就不行，那是因為國外自己定義的接口類型。

	2. java中的接口類似於生活中的接口，就是一些方法特徵的集合，但沒有方法的實現。
	具體可以看java接口這一章節的內容。
方式三：抽像類和抽象方法
*/


