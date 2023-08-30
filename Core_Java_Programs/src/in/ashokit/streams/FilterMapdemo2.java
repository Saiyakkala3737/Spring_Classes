package in.ashokit.streams;

import java.util.stream.Stream;

public class FilterMapdemo2 {

	public static void main(String[] args) {
		Employee e1 = new Employee("John", 35, 55000.00);
		Employee e2 = new Employee("David", 25, 45000.00);
		Employee e3 = new Employee("Buttler", 35, 35000.00);
		Employee e4 = new Employee("Steve", 45, 65000.00);

		Stream<Employee> stream = Stream.of(e1, e2, e3, e4);
		// using filter and map
		/*
		 * stream.filter(e -> e.salary >= 50000.00) .map(e -> e.name+ "-"+ e.age)
		 * .forEach(e ->System.out.println(e));
		 */

		// using only filter
		stream.filter(e -> e.salary >= 50000.00).forEach(e -> System.out.println(e.name + "-" + e.age));
	}

}

class Employee {

	String name;
	int age;
	double salary;

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee(String name2, int age2, double salary2) {
		// TODO Auto-generated constructor stub
	}
}
