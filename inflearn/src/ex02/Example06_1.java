package ex02;

import java.util.ArrayList;
import java.util.Scanner;

// 6.뒤집은 소수
public class Example06_1 {

	static ArrayList<Integer> solution(int n, int[] nums) {
		ArrayList<Integer> answer = new ArrayList<>();

		for(int i=0; i<n; i++) {
			int d = nums[i];
			int r = 0;
			while(d != 0) {
				r *= 10;
				r += d%10;
				d /= 10;
			}
			
			if(r == 1) continue;
			
			boolean isNotPrime = false;
			for(int j=2; j<r; j++) {
				if(r%j == 0) {
					isNotPrime = true;
					break;
				}
			}
			
			if(!isNotPrime) answer.add(r);
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
