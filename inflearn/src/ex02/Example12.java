package ex02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 12.멘토링
public class Example12 {

	static int solution(int n, int m, int[][] arr) {
		int answer = 0;
		
		Map<Integer, Integer> map;
		for(int i=1; i<=n; i++) {
			map = new HashMap<>();
			for(int j=1; j<=m; j++) {
				boolean isLow = false;
				for(int k=1; k<=n; k++) {
					if(arr[j][k] == i) {
						isLow = true;
						continue;
					}
					
					if(isLow) {
						map.put(arr[j][k], map.getOrDefault(arr[j][k], 0) + 1);
					}
				}
			}
			
			for(Map.Entry<Integer, Integer> elem : map.entrySet()) {
				if(elem.getValue() == m) answer ++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr = new int[m+1][n+1];
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println(solution(n, m, arr));
	}
}
