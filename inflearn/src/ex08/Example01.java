package ex08;

import java.util.Scanner;

// 1.합이 같은 부분집합(DFS)
public class Example01 {
	int len;
	int[] list;
	boolean[] visited;
	String result = "NO";
	
	public void dfs(int v) {
		if(v == len-1) {
			int sum1 = 0;
			int sum2 = 0;
			for(int i=0; i<len; i++) {
				if(visited[i]) {
					sum1 += list[i];
				} else {
					sum2 += list[i];
				}
			}
			
			if(sum1 == sum2) {
				result = "YES";
			}
		} else {
			visited[v] = false;
			dfs(v+1);
			visited[v] = true;
			dfs(v+1);
		}
	}
	
	public String solution(int n, int[] arr) {
		len = n;
		list = arr;
		visited = new boolean[n];
		
		dfs(0);
		
		String answer = result;
		return answer;
	}
	
	public static void main(String[] args) {
		Example01 main = new Example01();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(main.solution(n, arr));
	}
}
