package Day01;

public class String_indexOf {

	public static void main(String[] args) {
		
		String str = "thinking in java";
//		�q�Y�}�l�d��Ĥ@���X�{���a��
		int index = str.indexOf("in");
		System.out.println("index:"+index);
//		�q���w��l�}�l�d��
		index = str.indexOf("in",3);
		System.out.println("index:"+index);
//		�d��̫�@���X�{����l
		index = str.lastIndexOf("in");
		System.out.println("index:"+index);
	}

}
