package ex02;

import java.util.ArrayList;
import java.util.Scanner;

// 6.뒤집은 소수
public class Example06 {
	
	static boolean isPrime(int num) {
		if(num == 1) return false;
		
		for(int i=2; i<num; i++) {
			if(num%i == 0) return false;
		}
		
		return true;
	}

	static ArrayList<Integer> solution(int n, int[] nums) {
		ArrayList<Integer> answer = new ArrayList<>();

		for(int i=0; i<n; i++) {
			int tmp = nums[i];
			int res = 0;
			while(tmp > 0) {
				int t = tmp%10;
				res = res*10+t;
				tmp /= 10;
			}
			
			if(isPrime(res)) answer.add(res);
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

		for(int i : solution(n, nums)) {
			System.out.print(i + " ");
		}
	}
}
