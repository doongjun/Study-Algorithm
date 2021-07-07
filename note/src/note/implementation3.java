package note;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//나동빈
//문자열 재정렬
public class implementation3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		ArrayList<Character> alpa = new ArrayList<>();
		
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				alpa.add(str.charAt(i));
			}
			else {
				sum += Character.getNumericValue(str.charAt(i));
			}
		}
		Collections.sort(alpa);
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<alpa.size(); i++) {
			sb.append(alpa.get(i));
		}
		sb.append(Integer.toString(sum));
		String result = sb.toString();
		System.out.println(result); 
	}

}
