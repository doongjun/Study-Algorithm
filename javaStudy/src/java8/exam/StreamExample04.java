package java8.exam;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample04 {

	public static void main(String[] args) {
		
		int[] intArr = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArr);
		
		String[] strArr = Arrays.stream(intArr).mapToObj(String::valueOf).toArray(String[]::new);
		System.out.println(Arrays.toString(strArr));
		intStream.forEach(i -> System.out.print(i + " "));
	}

}
