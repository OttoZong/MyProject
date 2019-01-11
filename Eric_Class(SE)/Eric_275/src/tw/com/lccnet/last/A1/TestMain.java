package tw.com.lccnet.last.A1;

import tw.com.lccnet.last.DoStudent;
import tw.com.lccnet.last.DoWorker;
import tw.com.lccnet.last.Person;

/**
 * 
 * @author Otto
 *
 */
public class TestMain {
	public static void main(String[] args) {
		MyInfo<Person> info = new MyList<>();
		info.add(new DoWorker());
		info.add(new DoStudent());
	}
	
}
