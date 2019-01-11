package Day03;

public class TestWudejiecheng
{
	public static void main(String arg[])
	{
		System.out.println(f(5));
	}
	
	// »¼Âk¨ç¼Æ
	public static int f(int n)
	{
		if(n==1)//²×¤î±ø¥ó
		{
			return 1;
		}
		else
		{
			return n*f(n-1);
		}
	}
}
