package baekjoon;

import java.util.Scanner;

//2750
//수 정렬하기
public class Sort1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] nums = new int[n];
		
		for(int i=0; i<n; i++) {
			nums[i] = scan.nextInt();
		}
		
		for(int i=1; i<n; i++) {
			for(int j=i; j>0; j--) {
				if(nums[j]<nums[j-1]) {
					int tmp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = tmp;
				}
				else break;
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
