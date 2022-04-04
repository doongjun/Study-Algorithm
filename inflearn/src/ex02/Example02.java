package ex02;

import java.util.Scanner;

// 2.보이는 학생
public class Example02 {
	
	static int solution(int n, int[] nums) {
		int answer = 1;
		
		int max = nums[0];
		for(int i=1; i<n; i++) {
			if(nums[i] > max) {
				max = nums[i];
				answer++;
			}
		}
		
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