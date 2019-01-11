package Day12;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * �ϥ�DOM�ͦ�XML����
 * @author Otto
 *
 */
public class WriteXmlDemo {
	public static void main(String[] args) {
		/*
		 * �ͦ�XML���ɪ��j�P�B�J.
		 * 1.�Ыؤ@��Document��H��ܤ@�Ӫťդ���.
		 * 2.�VDocoument��H���K�[�ڤ���.
		 * 3.���ӹw�w�aXML���ɵ��c�q�ڤ����}�l�v�ŲK�[�l����.
		 * 4.�Ы�XMLWriter
		 * 5.�q�LXMLWriter�NDocoument�g�X�H�Φ�XML����
		 * 
		 */
		
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp(1,"�i�T",22,"�k",3000));
		list.add(new Emp(2,"���|",23,"�k",4000));
		list.add(new Emp(3,"����",24,"�k",5000));
		list.add(new Emp(4,"����",25,"�k",6000));
		list.add(new Emp(5,"���C",26,"�k",7000));
		
		try {
			//1
			Document doc = DocumentHelper.createDocument();
			/*
			 * 2
			 * Document���ѤF�K�[�ڤ�������k
			 * Element addElement(String name)
			 * �V��e��󤤲K�[���w�W�l���ڤ���,�ñN���HElement��Ҫ�^,
			 * �H�K�~��V�ڤ������l�[���e.
			 * �ݭn�`�N,�Ӥ�k�u��եΤ@��,�]���@�Ӥ��ɤ��u�঳�@�Ӯڤ���.
			 */
			Element root = doc.addElement("list");
			
			/*
			 * Element���ѤF�V���Ҥ��K�[�H����������k:
			 * 
			 * Element addElement(String name)
			 * �K�[���w�W�l���l���ҨñN���^.
			 * 
			 * Element addText(String text)
			 * �K�[�奻�H��.��^�Ȭ���e����,�o�˰��O�K��s��l�[�ާ@.
			 * 
			 * Element addAttribute(String name,String val)
			 * �K�[���w�W�l�ι����Ȫ��ݩ�,��^�Ȭ���e����.
			 * 
			 * �N�C�@��emp��ҥH�@��<emp>���Ҫ��Φ��K�[��ڼ���<list>��
			 */
			for(Emp emp : list){
				Element empEle = root.addElement("emp");
				//�K�[<name>
				Element nameEle = empEle.addElement("name");
				nameEle.addText(emp.getName());
				
				Element ageEle = empEle.addElement("age");
				ageEle.addText(emp.getAge()+"");
				
				Element genderEle = empEle.addElement("gender");
				genderEle.addText(emp.getGender());
				
				Element salaryEle = empEle.addElement("salary");
				salaryEle.addText(emp.getSalary()+"");
				
				empEle.addAttribute("id", emp.getId()+"");
			}
			
			XMLWriter writer = new XMLWriter(
					new FileOutputStream("myemp.xml"),
					OutputFormat.createCompactFormat()
			);
			
			writer.write(doc);
			System.out.println("�g�X����!");
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
