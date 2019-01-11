package tw.com.lccnet.uinfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.junit.Test;

import tw.com.lccnet.uinfo.bean.Employee;
import tw.com.lccnet.uinfo.bean.FilterEmployeeByAge;
import tw.com.lccnet.uinfo.bean.MyPredocate;

public class TestLambda {
	
	public void test1(){
		
		Comparator<Integer> com = new Comparator<Integer>(){
			
			public int compare(Integer o1,Integer o2){
				
				return Integer.compare(o1, o2);
			}
		};
		TreeSet<Integer> ts = new TreeSet<>(com);
	}
	
	
	//Lambda
	@Test
	public void test2(){
		Comparator<Integer> com = (x,y)->Integer.compare(x, y);
		TreeSet<Integer> ts = new TreeSet<>(com);
//		ts.forEach(System.out::println);
	}
	
	List<Employee> employees = Arrays.asList(
			new Employee(1,"Yang",25,36000),
			new Employee(2,"Eric",42,28000),
			new Employee(3,"Tom",33,45000),
			new Employee(4,"Many",55,22000),
			new Employee(5,"Jason",20,54000),
			new Employee(6,"peter",21,26500));
	
	
	@Test
	public void test3(){
		List<Employee> kist = filterEmployeeAge(employees);
		
		for(Employee employee:kist){
			System.out.println(employee);
		}
	}
	
	//取得公司年紀大於35歲.
	public List<Employee> filterEmployeeAge(List<Employee> list){
		List<Employee> emps = new ArrayList<>();
		for(Employee emp:list){
			if(emp.getAge() >=35){
				emps.add(emp);
			}
		}
		return emps;
	}
	
	@Test
	public void test4(){
		List<Employee> kist = filterEmployeeSalary(employees);
		
		for(Employee employee:kist){
			System.out.println(employee);
		}
	}
	
	//取得公司薪資大於35000.
	public List<Employee> filterEmployeeSalary(List<Employee> list){
		List<Employee> emps = new ArrayList<>();
		for(Employee emp:list){
			if(emp.getSalary() >=35000){
				emps.add(emp);
			}
		}
		return emps;
	}
	
	//設計模式
	
	public void test5(){
		List<Employee> list=filterEmployeeList(employees,new FilterEmployeeByAge());
		for(Employee employee:list){
			System.out.println(employee);
		}
	}


	public List<Employee> filterEmployeeList(List<Employee> list, MyPredocate<Employee> mp) {
		List<Employee> emps=new ArrayList<>();
		
		for(Employee employee:list){
			if(mp.test(employee)){
				emps.add(employee);
			}
		}
		return emps;
	}
	
}
