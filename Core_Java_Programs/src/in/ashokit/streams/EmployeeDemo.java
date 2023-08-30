package in.ashokit.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "ROBERT", 26500.00,"CHINA");
		Employee e2 = new Employee(2, "ABRAHAM", 46500.00,"INDIA");
		Employee e3 = new Employee(3, "CHING", 36500.00,"INDIA");
		Employee e4 = new Employee(4, "DAVID", 16500.00,"CHINA");
		Employee e5 = new Employee(5, "CATHY", 25500.00,"USA");

		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);
		// Stream<Employee> stream = Stream.of(e1, e2, e3, e4, e5);

		// to get max salary
		Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Max salary ::" + max.get().salary);

		// to get min salary
		Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Min salary ::" + min.get().salary);
		
		//to get avg salary
		Double avgsalary = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println(avgsalary);
		
		//groupBy data
		Map<String, List<Employee>> data = list.stream().collect(Collectors.groupingBy(e ->e.country));
		System.out.println(data);
	}

}

class Employee {

	int id;
	String name;
	double salary;
	String country;

	public Employee(int id, String name, double salary, String country) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country= country;
	}

}
