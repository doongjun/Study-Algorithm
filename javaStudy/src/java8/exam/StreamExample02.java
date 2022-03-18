package java8.exam;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample02 {

	public static void main(String[] args) {
		String[] strArr = {"A", "B", "C"};
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(alpa -> System.out.print(alpa + " "));
		System.out.println();
		
		int[] intArr = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(i -> System.out.print(i + " "));
	}

}
