package in.ashokit.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<String> javacourses = Arrays.asList("core java", "adv java", "springboot");
		List<String> uicourses = Arrays.asList("html", "css", "bs", "js");
		List<List<String>> courses = Arrays.asList(javacourses, uicourses);

		// using normal map
		courses.stream().forEach(c -> System.out.println(c));

		// usingflatmap
		Stream<String> flatMap = courses.stream().flatMap(s -> s.stream());
		flatMap.forEach(c -> System.out.println(c));
	}

}
