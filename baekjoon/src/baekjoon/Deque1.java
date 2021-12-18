package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

// 1021 회전하는 큐
public class Deque1 {
	static Deque<Integer> deque = new ArrayDeque<>();
	public static void main(String[] args) throws IOException {
		int answer = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		
		for(int i=1; i<n+1; i++) {
			deque.addLast(i);
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int targetNum = Integer.parseInt(st.nextToken());
			answer += findTargetNumCnt(targetNum);
		}
		
		System.out.println(answer);
	}
	
	public static int findTargetNumCnt(int targetNum) {
		Iterator iterator = deque.iterator();
		int idx = -1;
		int halfIdx;
		while(iterator.hasNext()) {
			idx++;
			if((int)iterator.next() == targetNum) break;
		}
		
		if(deque.size()%2 == 0) {
			halfIdx = deque.size()/2 - 1;
		}else {
			halfIdx = deque.size()/2;
		}
		
		int count = 0;
		if(idx <= halfIdx) {
			while(deque.peekFirst() != targetNum) {
				deque.addLast(deque.pollFirst());
				count++;
			}
			deque.pollFirst();
		}else {
			while(deque.peekLast() != targetNum) {
				deque.addFirst(deque.pollLast());
				count++;
			}
			deque.addFirst(deque.pollLast());
			count++;
			deque.pollFirst();
		}
		
		return count;
	}

}
