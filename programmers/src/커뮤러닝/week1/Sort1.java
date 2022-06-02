package 커뮤러닝.week1;

import java.util.Arrays;
import java.util.Comparator;

public class Sort1 {
	
	public static String solution(int[] numbers) {

        String[] strNums = Arrays.stream(numbers)
                                .mapToObj(String::valueOf)
                                .toArray(String[]::new);

        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });

        if(strNums[0].equals("0")) return "0";

        return String.join("", strNums);
    }
	
	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		
		System.out.println(solution(numbers));
	}

}
