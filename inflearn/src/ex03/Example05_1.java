package ex03;

import java.util.Scanner;

// math
// 5.연속된 자연수의 합
public class Example05_1 {

	static int solution(int n) {
		int answer=0, cnt=1;
		n--;
		while(n>0) {
			n -= ++cnt;
			if(n%cnt == 0) answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(solution(n));
	}
}
