package in.ashokit.java8;
import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args)
	{
		StringJoiner sj1 = new StringJoiner("-");
		sj1.add("sai");
		sj1.add("kumar");
		System.out.println(sj1);
		
		StringJoiner sj2 = new StringJoiner("-" , "(",")");
		sj2.add("sai");
		sj2.add("kumar");
		System.out.println(sj2);
	}
}
