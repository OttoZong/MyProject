package Day02;

public class String_split_rename {
	public static void main(String[] args) {
		String imgName = "123.jpg";	
		String[] data = imgName.split("\\.");
		//«ö·Ó"."©î¤À
//		System.out.println(data.length);
		
		imgName = System.currentTimeMillis()+"."+data[1];
		System.out.println(imgName);
	}
	
}
