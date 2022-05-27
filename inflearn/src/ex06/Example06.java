package ex06;

import java.util.Arrays;
import java.util.Scanner;

public class Example06 {

    static String solution(int n, int[] arr) {
    	StringBuilder sb = new StringBuilder();
    	
    	int[] tmp = new int[n];
    	for(int i=0; i<n; i++) {
    		tmp[i] = arr[i];
    	}
    	
    	Arrays.sort(tmp);
    	
    	for(int i=0; i<n; i++) {
    		if(arr[i] != tmp[i]) {
    			sb.append(i+1).append(" ");
    		}
    	}
    	
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print(solution(n, arr));
    }
}
