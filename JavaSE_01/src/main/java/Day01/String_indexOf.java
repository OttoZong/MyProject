package Day01;

public class String_indexOf {

	public static void main(String[] args) {
		
		String str = "thinking in java";
//		從頭開始查找第一次出現的地方
		int index = str.indexOf("in");
		System.out.println("index:"+index);
//		從指定位子開始查找
		index = str.indexOf("in",3);
		System.out.println("index:"+index);
//		查找最後一次出現的位子
		index = str.lastIndexOf("in");
		System.out.println("index:"+index);
	}

}
