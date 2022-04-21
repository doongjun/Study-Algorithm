package ex04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// hash, sliding window algorithm
// 3.매츌액의 종류
public class Example03 {

	static ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<k; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		answer.add(map.size());

		for(int i=k; i<n; i++) {
			int preKey = arr[i-k];
			map.put(preKey, map.get(preKey)-1);
			if(map.get(preKey) < 1) map.remove(preKey);
			
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			answer.add(map.size());
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
 		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i : solution(n, k, arr)) {
			System.out.print(i + " ");
		}
	}
}
