package in.ashokit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	String name;
	String location;
	String dept;
	public Employee(String name, String location, String dept) {
		super();
		this.name = name;
		this.location = location;
		this.dept = dept;
	}
	
}

public class PredicateJoinDemo {
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Raju", "chennai", "devops");
		Employee e2 = new Employee("Rani", "Pune", "Networking");
		Employee e3 = new Employee("Ashok", "Hyd", "DB");
		Employee e4 = new Employee("Ganesh", "Delhi", "Testing");
		
		List<Employee> emp= Arrays.asList(e1,e2,e3,e4);
		Predicate<Employee> p1 = e -> e.location.equals("Hyd");
		Predicate<Employee> p2 = e ->e.dept.equals("DB");
		Predicate<Employee>p = p1.and(p2);
		
		for(Employee e: emp) {
			if(p.test(e)){
				System.out.println(e.name);
			}
		}
		
		
	}

}
