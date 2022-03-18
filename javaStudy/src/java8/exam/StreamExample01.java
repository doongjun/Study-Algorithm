package java8.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamExample01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
		
		/*
		 * Java6
		 */
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			int num = iter.next();
			System.out.println("값 : " + num);
		}
		System.out.println("=====================");
		/*
		 * Java8
		 */
		Stream<Integer> stream = list.stream();
		stream.forEach(num -> System.out.println("값 : " + num));
	}

}
