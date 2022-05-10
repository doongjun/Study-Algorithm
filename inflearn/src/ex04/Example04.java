package ex04;

import java.util.HashMap;
import java.util.Scanner;

// hash, sliding window algorithm
// 4.모든 아나그램 찾기
public class Example04 {

	static int solution(String s, String t) {
		int answer = 0;
		
		HashMap<Character, Integer> tMap = new HashMap<>();
		for(char c : t.toCharArray()) {
			tMap.put(c, tMap.getOrDefault(c, 0)+1);
		}
		
		HashMap<Character, Integer> sMap = new HashMap<>();
		for(int i=0; i<t.length()-1; i++) {
			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
		}
		
		int lt = 0;
		for(int rt=t.length()-1; rt<s.length(); rt++) {
			sMap.put(s.charAt(rt), sMap.getOrDefault(s.charAt(rt), 0)+1);
			if(tMap.equals(sMap)) answer++;
			
			if(sMap.get(s.charAt(lt)) > 1) {
				sMap.put(s.charAt(lt), sMap.get(s.charAt(lt))-1);
			} else {
				sMap.remove(s.charAt(lt));
			}
			lt++;
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		String t = scan.next();
		
		System.out.println(solution(s, t));
	}
}
