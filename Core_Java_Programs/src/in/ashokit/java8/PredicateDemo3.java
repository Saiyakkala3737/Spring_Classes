package in.ashokit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

public class PredicateDemo3 {
	
	public static void main(String[] args)
	{
		Person p1= new Person("sai",26);
		Person p2= new Person("sai1",16);
		Person p3= new Person("sai2",36);
		Person p4= new Person("sai3",6);
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Person> predicate = p -> p.age>=18;
		for(Person person : persons)
		{
			if(predicate.test(person)) {
				System.out.println(person.name);
			}
		}
	}

}
