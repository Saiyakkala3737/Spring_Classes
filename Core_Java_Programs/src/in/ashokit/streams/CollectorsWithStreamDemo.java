package in.ashokit.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsWithStreamDemo {
	
	public static void main(String[] args) {
		CountryPerson p1 = new CountryPerson("JOHN","USA");
		CountryPerson p2 = new CountryPerson("STEVE","JAPAN");
		CountryPerson p3 = new CountryPerson("ASHOK","INDIA");
		CountryPerson p4 = new CountryPerson("CHING","CHINA");
		CountryPerson p5 = new CountryPerson("KUMAR","INDIA");

		List<CountryPerson> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		List<String> names = persons.stream().filter(p ->p.Country.equals("INDIA"))
									.map(p -> p.name)
									.collect(Collectors.toList());
		System.out.println(names);
		
	}

}

class CountryPerson {
	String name;
	String Country;
	public CountryPerson(String name, String country) {
		super();
		this.name = name;
		Country = country;
	}
	
	
}