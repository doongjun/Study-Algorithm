package baekjoon;

import java.util.Scanner;

//2839 그리디1
public class Greedy1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int cnt = 0;
		while(N>0) {
			if(N%3==0 && N<10) {
				N -= 3;
			}
			else
				N -= 5;
			cnt++;
		}
		
		if(N<0) cnt = -1;
		System.out.println(cnt);
	}

}
