package in.ashokit.streams;

import java.util.Arrays;
import java.util.List;

public class FilterMapdemo {

	public static void main(String[] args)
	{
		List<String> names= Arrays.asList("Ashok","Anil","Raju","Rani","John","Akahs");
		
		names.stream()
			  .filter(name->name.startsWith("A"))
			  .map(name-> name + "-"+name.length())
			  .forEach(name->System.out.println(name));
	}
}
