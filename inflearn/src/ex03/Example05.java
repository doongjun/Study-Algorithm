package ex03;

import java.util.Scanner;

// two pointers algorithm
// 5.연속된 자연수의 합
public class Example05 {

	static int solution(int n) {
		int answer=0, sum=0, lt=1;
		int m = n/2+1;
		
		for(int rt=1; rt<=m; rt++) {
			sum += rt;
			if(sum == n) {
				answer++;
			}
			
			while(sum >= n) {
				sum -= lt++;
				if(sum == n) {
					answer++;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(solution(n));
	}
}
