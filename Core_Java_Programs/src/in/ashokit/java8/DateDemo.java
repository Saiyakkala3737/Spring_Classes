package in.ashokit.java8;
import java.util.*;
import java.text.*;

public class DateDemo {
	
	public static void main(String[] args) {
		Date d= new Date();
		System.out.println(d);
		
		//CONVERTING DATAE TO STRING
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String formate= sdf.format(d);
		System.out.println(formate);
		
		//Converting STRING TO DATE
		
		SimpleDateFormat sdf3= new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate =sdf3.parse("2022-12-20");
		System.out.println(parsedDate);
		
	}

}
