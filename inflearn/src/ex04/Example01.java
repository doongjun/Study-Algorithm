package ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// hash
// 1.학급회장
public class Example01 {

	static Character solution(int n, String str) {
		Character answer=0;
		int max=0;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			Character c = str.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() > max) {
				max = entry.getValue();
				answer = entry.getKey();
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String str = scan.next();
		
		System.out.println(solution(n, str));
	}
}
