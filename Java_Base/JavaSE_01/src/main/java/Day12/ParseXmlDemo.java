package Day12;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * �ϥ�Dom�ѪRXML���
 * @author Otto
 *
 */
public class ParseXmlDemo {
	public static void main(String[] args) {
		/*
		 * �ѪRXML���j�P�B�J
		 * 1.�Ы�SAXReader
		 * 2.�ϥ�SAXReaderŪ��XML���åͦ�Document��H.
		 * �o�@�B�J�N�ODOM�ѪR�ӮɯӸ귽���a��,
		 * �]���n���NXML��󤺮e����Ū������,�åͦ��@��Document��H.
		 * 3.�q�LDocument����ڤ���
		 * 4.����XML��󪺵��c�q�ڤ����}�l�v������l�����H�F��M��XML���ƾڪ��ت�.
		 */
		/*
		 * �Ӷ��X�Ω�O�s�qemplist.xml���ɤ�.
		 * �ѪR�X�Ӫ����u�H��.
		 */
		List<Emp> list = new ArrayList<Emp>();
		
		try {
			//1
			SAXReader reader = new SAXReader();
			
			//2
//			reader.read(new File("emplist.xml"));
			Document doc = reader.read(
					new FileInputStream("emplist.xml")
			);
			System.out.println("Ū������!");
			/*
			 * 3
			 * Document���ѤF����ڤ�������k:
			 * Element getRootElement()
			 * 
			 * Element���C�@�ӹ�ҥΩ���XML���ɤ����@�Ӥ���(�@�����).
			 * 
			 * Element ���ѤF������ܪ����������H������k:
			 * 
			 * String getName()
			 * ������Ҫ��W�l
			 * 
			 * String getText()
			 * ������Ҥ������奻�H��(�}�l���һP�������Ҥ������奻)
			 * 
			 * Element element(String name)
			 * ������w�W�l���l����
			 * 
			 * List elements()
			 * ����Ҧ����l����
			 * 
			 * List elements(String name)
			 * ����Ҧ��P�W�l����
			 * 
			 * Attribute attribute(String name)
			 * ������w�W�l���ݩ�
			 */
			Element root = doc.getRootElement();
			/*
			 * ����ڤ���<list>�U�����Ҧ��l����
			 * �Y�z��<emp>����.�ӨC�@��<emp>�����]�O�ϥ�Element��Ҫ��,
			 * �æs�J�@�Ӷ��X���^.
			 */
			List<Element> empList = root.elements();
			for(Element empEle : empList){
				//������u�m�W
//				System.out.println(empEle.getName());
				Element nameEle = empEle.element("name");
				String name = nameEle.getText();
				System.out.println(name);
				
				//���age
				int age = Integer.parseInt(empEle.elementText("age"));
				/*
				 * Element���@�ӥi�H�ֳt����l���Ҥ������奻��k:
				 * String elementText(String name)
				 * �Ҧp:
				 * empEle.elementText("gender")
				 * ���P��
				 * empEle.element("gender").getText()
				 */
				//���gender
				String gender = empEle.elementText("gender");
				
				int salary = Integer.parseInt(empEle.elementText("salary"));
				
//				Attribute attr = empEle.attribute("id");
//				int id = Integer.parseInt(attr.getValue());
				int id = Integer.parseInt(empEle.attributeValue("id"));
				
				Emp emp = new Emp(id, name, age, gender, salary);
				list.add(emp);
			}
			
			System.out.println("�ѪR����!");
			for(Emp emp : list){
				System.out.println(emp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
