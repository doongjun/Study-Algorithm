package ex06;

import java.util.Arrays;
import java.util.Scanner;

public class Example10 {
	public static int count(int[] x, int d) {
		int count = 1;
		int endPoint = x[0];
		for(int i=1; i<x.length; i++) {
			if((x[i]-endPoint) >= d) {
				count++;
				endPoint=x[i];
			}
		}
		return count;
	}
	
    public static int solution(int n, int c, int[] x) {
       int answer = 0;
       
       Arrays.sort(x);
       int min = 1;
       int max = x[n-1];
       
       while(min <= max) {
    	   int mid = (min+max)/2;
    	   if(count(x, mid) >= c) {
    		   answer = mid;
    		   min = mid+1;
    	   } else {    		   
    		   max = mid-1;
    	   }
       }
       
       return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int c = scan.nextInt();
        int[] x = new int[n];
        for(int i=0; i<n; i++) {
            x[i] = scan.nextInt();
        }

        System.out.println(solution(n, c, x));
    }
}