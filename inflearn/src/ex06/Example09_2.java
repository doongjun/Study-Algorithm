package ex06;

import java.util.Arrays;
import java.util.Scanner;

public class Example09_2 {
	public static int count(int[] arr, int capacity) {
		int count=1, sum=0;
		for(int x : arr) {
			if(sum+x > capacity) {
				count++;
				sum=x;
			} else {
				sum+=x;
			}
		}

		return count;
	}
	
	
    public static int solution(int n, int m, int[] songs) {
        int answer=0;
        
        int min = Arrays.stream(songs).max().getAsInt();
        int max = Arrays.stream(songs).sum();
        
        while(min<=max) {
        	int mid = (min+max)/2;
        	if(count(songs, mid) <= m) {
        		answer = mid;
        		max = mid-1;
        	} else {
        		min = mid+1;
        	}
        }
        
        return answer;
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