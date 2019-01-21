package tw.ottozong.spring.dao;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ottozong.spring.bean.Uid;

public class TestDao {

	@Test
	public void testInsert(){
		//1.加載Spring配置,獲取Spring容器.
		AbstractApplicationContext ac =
				new ClassPathXmlApplicationContext("spring-mvc.xml");
		//2.獲取IUserDao對象.
		IUidDao uidDao =
				ac.getBean("uidDao",IUidDao.class);
		//3.測試功能.
		String id = "ott";
		Uid uid = new Uid(
			0,
			"Amy",
			"want a apple",
			"buy the apple"
		);
		
		Integer P_uid = uidDao.insert_list(uid);
		System.out.println("完成增加TodoList,返回:"+P_uid);
		//4.釋放資源.
		ac.close();
		
		
		
	}
}
