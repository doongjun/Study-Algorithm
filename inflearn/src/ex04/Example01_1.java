package ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// hash
// 1.학급회장
public class Example01_1 {

	static char solution(int n, String str) {
		char answer=0;
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int max=Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
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
