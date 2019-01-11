package reflect;

public class B {
	public void f1(){
		System.out.println("f1()");
	}
	
	@Test(value="hello")
	public void testF2(){
		System.out.println("testF2()");
	}
	
	@Test(value="welcome")
	public void testF3(){
		System.out.println("testF3()");
	}
	
}
