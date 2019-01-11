package Day05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 對象反序列化
 * @author Otto
 *
 */
public class OIS_readObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object_Person p = (Object_Person)ois.readObject();
		System.out.println(p);
		
		ois.close();
	}
}
