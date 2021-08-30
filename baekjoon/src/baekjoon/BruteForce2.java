package baekjoon;

import java.util.Scanner;

public class BruteForce2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] kg = new int[n];
		int[] cm = new int[n];
		int[] rank = new int[n];
		for(int i=0; i<n; i++) {
			kg[i] = scan.nextInt();
			cm[i] = scan.nextInt();
			rank[i] = 1;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i == j) continue;
				if(kg[i] < kg[j] && cm[i] < cm[j]) rank[i]++;
			}
		}
		
		for(int x : rank) {
			System.out.print(x + " ");
		}

	}

}
