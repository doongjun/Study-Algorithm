package ex06;

import java.util.Scanner;

public class Example09_1 {
	public static int count(int[] arr, int capacity) {
		int count = 0;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			int tmp = sum + arr[i];
			if(tmp <= capacity) {
				sum += arr[i];
			} else {
				sum = arr[i];
				count++;
			}
		}
		return count;
	}
	
	
    public static int solution(int n, int m, int[] songs) {
        int answer = 0;
    
        int min = 10000;
        int max = 0;
        for(int song : songs) {
        	min = Math.min(min, song);
            max += song;
        }
    
        while(min < max) {
     	   	int mid = (min+max)/2;
     	   	if(count(songs, mid) >= m) {
     	   		min = mid+1;
     	   	} else {
     	   		max = mid;
     	   	}
        }
    
        return min;
     }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] songs = new int[n];
        for(int i=0; i<n; i++) {
            songs[i] = scan.nextInt();
        }
    
        System.out.println(solution(n, m, songs));
    }

}