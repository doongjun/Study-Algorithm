package note;

import java.util.Arrays;
import java.util.Scanner;

//나동빈
//모럼가 길드
public class Greedy4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] p = new int[N];
		for(int i=0; i<N; i++) {
			p[i] = scan.nextInt();
		}
		Arrays.sort(p);
		
		int count = 0;
		int result = 0;
	
		for(int i=0; i<p.length; i++) {
			count++;
			if(p[i] <= count) {
				result++;
				count = 0;
			}
		}
		System.out.println(result);
	}

}
