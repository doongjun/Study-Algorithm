package java8.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(
				Arrays.asList("A", "B", "C", "D", "E"));
		Stream<String> stream = list.stream()
									.map(s -> s.toLowerCase());
		
		stream.forEach(s->System.out.print(s + " "));
	}

}
