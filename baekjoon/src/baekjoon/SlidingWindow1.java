package baekjoon;

import java.util.Scanner;

// 2559 수열
public class SlidingWindow1 {

    static int solution(int n, int k, int[] arr) {
        int answer=0, sum=0;

        for(int i=0; i<k; i++) {
            sum += arr[i];
        }

        answer = sum;
        for(int i=k; i<n; i++) {
            sum += arr[i] - arr[i-k];
            if(sum > answer) answer = sum;
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

        System.out.println(solution(n, k, arr));
    }

}
