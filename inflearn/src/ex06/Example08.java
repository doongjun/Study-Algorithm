package ex06;

import java.util.Scanner;

public class Example08 {
    static int solution(int n, int m, int[] arr) {

        for(int i=1; i<n; i++) {
            int j;
            int target = arr[i];
            for(j=i-1; j>=0 && arr[j]>target; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = target;
        }

        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while(end-start >= 0) {
            if(arr[mid] == m) return mid+1;
            else if(arr[mid] < m) start = mid+1;
            else end = mid-1;

            mid = (start+end)/2;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
