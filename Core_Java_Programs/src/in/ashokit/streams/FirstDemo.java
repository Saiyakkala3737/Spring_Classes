package in.ashokit.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FirstDemo {
	
	public static void main(String[] args)
	{
		//approach-1
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
		
		ArrayList<String>  names = new ArrayList<>();
		names.add("John");
		names.add("Robert");
		names.add("Orlen");
		
		//approach-2
		Stream<String> stream2= names.stream();
		}

}
