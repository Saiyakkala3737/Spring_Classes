package in.ashokit.streams;

import java.util.Arrays;
import java.util.List;

public class MatchingOperationsDemo {
public static void main(String[] args) {
	Person p1 = new Person("John", "USA");
	Person p2 = new Person("Steve", "JAPAN");
	Person p3 = new Person("ASHOK", "INDIA");
	Person p4 = new Person("CHING", "CHINA");
	
	List<Person> persons = Arrays.asList(p1,p2,p3,p4);
	
	boolean status = persons.stream().anyMatch(p ->p.country.equals("INDIA"));
	System.out.println("ANY INDIAN AVAILABALE ? ::"+status);
	boolean status1 = persons.stream().allMatch(p ->p.country.equals("INDIA"));
	System.out.println("ANY INDIAN AVAILABALE ? ::"+status1);
}
}

class Person {
	String name;
	String country;

	public Person(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
}