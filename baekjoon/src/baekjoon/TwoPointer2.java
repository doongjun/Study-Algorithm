package baekjoon;

import java.util.Scanner;

// 1806 부분합
public class TwoPointer2 {

    static int solution(int n, int s, int[] arr) {
        int answer=100000001, sum=0, lt=0, len=0;

        for(int rt=0; rt<n; rt++) {
            sum += arr[rt];
            while(sum >= s) {
                len = rt-lt+1;
                if(len < answer) answer = len;
                sum -= arr[lt++];
            }
        }

        if(len == 0) answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int s = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(solution(n, s, arr));
    }

}
