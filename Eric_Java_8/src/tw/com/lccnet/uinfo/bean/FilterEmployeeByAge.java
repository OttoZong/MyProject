package tw.com.lccnet.uinfo.bean;

public class FilterEmployeeByAge implements MyPredocate<Employee>{

	public boolean test(Employee t){
		
		return t.getAge()>=35;
	}
}
