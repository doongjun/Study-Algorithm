package baekjoon;

import java.util.*;

//1158
//요세푸스 문제
public class Queue2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			queue.offer(i);
		}
		
		int cnt = 1;
		System.out.print("<");
		while(!queue.isEmpty()) {
			if(cnt!=k) {
				queue.offer(queue.poll());
				cnt++;
				continue;
			}
			if(queue.size()==1) {
				System.out.print(queue.poll());
			}
			else {
				System.out.print(queue.poll()+", ");
			}
			
			cnt=1;
		}
		System.out.print(">");
	}
	

}
