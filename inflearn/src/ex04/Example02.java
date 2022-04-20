package ex04;

import java.util.HashMap;
import java.util.Scanner;

// hash
// 2.아나그램
public class Example02 {

	static String solution(String str1, String str2) {
		String answer = "NO";
		
	    HashMap<Character, Integer> map1 = new HashMap<>();
	    HashMap<Character, Integer> map2 = new HashMap<>();
		for(int i=0; i<str1.length(); i++) {
			char c1 = str1.charAt(i);
			map1.put(c1, map1.getOrDefault(c1, 0)+1);
			char c2 = str2.charAt(i);
			map2.put(c2, map2.getOrDefault(c2, 0)+1);
		}
		
		if(map1.equals(map2)) answer = "YES";
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str1 = scan.next();
		String str2 = scan.next();
		
		System.out.println(solution(str1, str2));
	}
}
