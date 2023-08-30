package in.ashokit.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NumberSort1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);

		System.out.println("before sort :" + al);
		Collections.sort(al, (i,j) -> (i>j) ? -1:1);
		System.out.println("After sort :: " +al);
	}
}

