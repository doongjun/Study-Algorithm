package ex05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// queue
// 8.응급실
public class Example08 {
	static int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		Queue<Integer> line = new LinkedList<>();
		for(int i=0; i<n; i++) {
			line.offer(arr[i]);
		}

		while(m != -1) {
			int target = line.poll();
			m--;
			Iterator<Integer> iter = line.iterator();
			while(iter.hasNext()) {
				if(iter.next() > target) {
					line.offer(target);
					if(m==-1) {
						m=line.size()-1;
					}
					break;
				}
			}
		}
		
		answer = n - line.size();
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(solution(n, m, arr));
	}
}
