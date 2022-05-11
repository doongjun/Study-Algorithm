package ex04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

// 5.k번째 큰 수
public class Example05 {

	static int solution(int n, int k, int[] cards) {
		int answer = -1;
		
		TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
		
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int l=j+1; l<n; l++) {
					tSet.add(cards[i] + cards[j] + cards[l]);
				}
			}
		}
		
		int cnt = 0;
		for(int x : tSet) {
			if(k == ++cnt) return x;
		}
		
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] cards = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n, k, cards));
	}
}
