package note;

import java.util.Scanner;

//나동빈
//곱하기 혹은 더하기
public class Greedy3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int sum = Character.getNumericValue(str.charAt(0));
		
		for(int i=1; i<str.length(); i++) {
			int num = Character.getNumericValue(str.charAt(i));
			
			if(sum<=1 || num<=1)
				sum+=num;
			else
				sum*=num;
			
		}
		System.out.println(sum);
	}

}
