package Day03;

public class TimeMachine
{
	public static void main(String arg[])
	{
		
		System.out.println("歡迎來到全面啟動時間流速模擬計算機");
		System.out.println("設定:李奧納多在夢境掉入幾層呢?  7層");
//		Scanner scan = new Scanner(System.in);
//		for(int i=7;i>=1;i--) {
//			System.out.println(i+"!");
//		}
		System.out.println("時間流速是:7!="+f(7));
		System.out.println("備註:數字越大,體感時間越久");
	}
	
	//遞歸函数
	public static int f(int n)
	{
		if(n==1)//终止条件
		{
			return 1;
		}
		else
		{
			return n*f(n-1);

		}
	}
}