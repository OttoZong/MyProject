package Day03;

public class TestWudejiecheng
{
	public static void main(String arg[])
	{
		System.out.println(f(5));
	}
	
	// ���k���
	public static int f(int n)
	{
		if(n==1)//�פ����
		{
			return 1;
		}
		else
		{
			return n*f(n-1);
		}
	}
}
