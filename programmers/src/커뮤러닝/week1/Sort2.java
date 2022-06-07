package 커뮤러닝.week1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

//가장 큰 수
public class Sort2 {
	
	public static String solution(int[] numbers) {
		
		// 람다 사용 sort
        //Arrays.sort(strNums, (s1, s2) -> (s2+s1).compareTo(s1+s2));
		
        String answer = IntStream.of(numbers)
        	.mapToObj(String::valueOf) // 메소드레퍼런스 == mapToObj(n -> String.valueOf(n))
        	.sorted((s1, s2) -> (s2+s1).compareTo(s1+s2))
        	.collect(Collectors.joining());

        if(answer.startsWith("0")) return "0";

        return answer;
    }
	
	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		
		System.out.println(solution(numbers));
	}

}
