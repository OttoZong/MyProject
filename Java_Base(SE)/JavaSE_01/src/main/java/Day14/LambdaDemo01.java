package Day14;
/**
 * # Java API
 *
 *##Lambda 表達式
 *
 *	1. Java 8 (Java 1.8) 提供的新語法.
 *	2.相當等於一個簡化版的 匿名內部類,有人也稱為匿名方法.
 *	3.Java 集合提供了 Lambda表達式功能.
 *	4.Lambda是功能接口的簡單實現.
 *
 *### 功能性接口
 *
 *只有一個方法的接口,稱為功能性接口.
 *
 *##  日期處理
 *
 *
 * @author Otto
 *
 */
public class LambdaDemo01 {
	public static void main(String[] args) {
		/*
		 * Lambda 表達式演示.
		 */
		//利用匿名內部類"快捷"實現接口.
		Foo foo = new Foo(){
			public double test(int a,double b){
				return a+b;
			}
		};
		System.out.println(foo.test(4, 5.6));
		//使用Lambda表達式實現功能接口.
		Foo foo1 = (int a,double b)->{return a+b;};
		//當語句塊只有一行時候,可以省略{}.
		Foo foo2 = (a,b)->a+b;
		
		//測試.
		System.out.println(foo1.test(5, 6.7));
		System.out.println(foo2.test(5, 6.7));
		
		//在Lambda表達式中使用多行語句.
		Foo foo3 = (a, b)->{a++;b++;return a+b;};
		System.out.println(foo3.test(5, 6.7));
		
		//使用Lambda 實現Goo接口
		Goo goo = b->{System.out.println(b);};
		//調用
		goo.test(5.5);
		
		//當方法參數是一個接口類型時候,Lambda 可以作為方法參數值使用.
		Goo goo1 = b->System.out.println(b);
		demo(goo1);
		demo(b->System.out.println(b));//簡潔.
	}
	
	public static void demo(Goo goo){
		goo.test(5.5);
	}
}

/**
 * 功能性接口: 只有一個方法的接口
 * @author Otto
 *
 */
interface Foo{
	double test(int a,double b);
}
interface Goo{
	void test(double b);
}
