package baekjoon;

import java.util.Scanner;

//11399
//ATM
public class Sort2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] p = new int[n];
		
		for(int i=0; i<n; i++) {
			p[i] = scan.nextInt();
		}
		
		for(int i=1; i<n; i++) {
			for(int j=i; j>0; j--) {
				if(p[j] < p[j-1]) {
					int tmp = p[j];
					p[j] = p[j-1];
					p[j-1] = tmp;
				}
			}
		}
		int sum = 0;
		int answer = 0;
		for(int i=0; i<n; i++) {
			sum += p[i];
			answer += sum;
		}
		System.out.println(answer);
	}

}
