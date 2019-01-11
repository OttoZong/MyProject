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
 * 使用DOM生成XML文檔
 * @author Otto
 *
 */
public class WriteXmlDemo {
	public static void main(String[] args) {
		/*
		 * 生成XML文檔的大致步驟.
		 * 1.創建一個Document對象表示一個空白文檔.
		 * 2.向Docoument對象中添加根元素.
		 * 3.按照預定地XML文檔結構從根元素開始逐級添加子元素.
		 * 4.創建XMLWriter
		 * 5.通過XMLWriter將Docoument寫出以形成XML文檔
		 * 
		 */
		
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp(1,"張三",22,"男",3000));
		list.add(new Emp(2,"李四",23,"女",4000));
		list.add(new Emp(3,"王五",24,"男",5000));
		list.add(new Emp(4,"趙六",25,"女",6000));
		list.add(new Emp(5,"錢七",26,"男",7000));
		
		try {
			//1
			Document doc = DocumentHelper.createDocument();
			/*
			 * 2
			 * Document提供了添加根元素的方法
			 * Element addElement(String name)
			 * 向當前文件中添加給定名子的根元素,並將它以Element實例返回,
			 * 以便繼續向根元素中追加內容.
			 * 需要注意,該方法只能調用一次,因為一個文檔中只能有一個根元素.
			 */
			Element root = doc.addElement("list");
			
			/*
			 * Element提供了向標籤中添加信息的相關方法:
			 * 
			 * Element addElement(String name)
			 * 添加給定名子的子標籤並將其返回.
			 * 
			 * Element addText(String text)
			 * 添加文本信息.返回值為當前標籤,這樣做是便於連續追加操作.
			 * 
			 * Element addAttribute(String name,String val)
			 * 添加給定名子及對應值的屬性,返回值為當前標籤.
			 * 
			 * 將每一個emp實例以一個<emp>標籤的形式添加到根標籤<list>中
			 */
			for(Emp emp : list){
				Element empEle = root.addElement("emp");
				//添加<name>
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
			System.out.println("寫出完畢!");
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
