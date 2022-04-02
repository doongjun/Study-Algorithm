package ex02;

import java.util.Scanner;

// 1.큰 수 출력하기
public class Example01 {
	
	static String solution(int n, int[] nums) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		
		sb.append(nums[0]).append(" ");
		for(int i=1; i<n; i++) {
			if(nums[i] > nums[i-1]) {
				sb.append(nums[i]).append(" ");
			}
		}
		
		answer = sb.toString();
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = scan.nextInt();
		}

		System.out.println(solution(n, nums));
	}
}
