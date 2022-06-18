package ex08;

import java.util.Scanner;

// 1.합이 같은 부분집합(DFS)
public class Example01_1 {
	int len;
	static int total=0;
	int[] list;
	String result = "NO";
	boolean flag = false;
	
	public void dfs(int v, int sum) {
		if(flag) return;
		if(sum>total/2) return;
		if(v==list.length) {
			if((total-sum)==sum) {
				result="YES";
			}
		} else {
			dfs(v+1, sum+list[v]);
			dfs(v+1, sum);
		}
	}
	
	public String solution(int n, int[] arr) {
		len = n;
		list = arr;
		
		dfs(0, 0);
		
		String answer = result;
		return answer;
	}
	
	public static void main(String[] args) {
		Example01_1 main = new Example01_1();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			total += arr[i];
		}
		
		System.out.println(main.solution(n, arr));
	}
}
