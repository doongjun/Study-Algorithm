package ex04;

import java.util.HashMap;
import java.util.Scanner;

// hash
// 2.아나그램
public class Example02_1 {

	static String solution(String str1, String str2) {
		String answer = "YES";
		
	    HashMap<Character, Integer> map = new HashMap<>();
		
	    for(char c : str1.toCharArray()) {
	    	map.put(c, map.getOrDefault(c, 0)+1);
	    }
	    
	    for(char c : str2.toCharArray()) {
	    	if(!map.containsKey(c) || map.get(c)==0) return "NO";
	    	map.put(c, map.get(c)-1);
	    }
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str1 = scan.next();
		String str2 = scan.next();
		
		System.out.println(solution(str1, str2));
	}
}
