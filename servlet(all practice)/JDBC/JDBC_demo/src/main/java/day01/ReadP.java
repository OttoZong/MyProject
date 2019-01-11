package day01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadP {
	public static void main(String[] args) throws IOException {
		//1.創建properties對象
		Properties cgf = new Properties();
		//2.讀取配置文件
		InputStream inStream = 
				ReadP.class.getClassLoader().getResourceAsStream("db.properties");
//		System.out.println(inStream);
		cgf.load(inStream);
		String className=cgf.getProperty("jdbc.className");
		String url = cgf.getProperty("jdbc.url");
		String user = cgf.getProperty("jdbc.user");
		String password = cgf.getProperty("jdbc.password");
//		System.out.println(className);
		}
}
