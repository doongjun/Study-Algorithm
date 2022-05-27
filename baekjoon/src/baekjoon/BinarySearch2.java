package baekjoon;

import java.util.Scanner;

// 1654 랜선자르기
public class BinarySearch2 {
    static long solution(int k, int n, int[] lines) {
        long min=0, max=0;
        for(int len : lines) {
            max = Math.max(max, len);
        }
        max++;
        long mid;
        while(min < max) {
            mid = (min+max)/2;

            long cnt = 0;
            for(int len : lines) {
                cnt += len/mid;
            }

            if(cnt < n) {
                max = mid;
            } else {
                min = mid+1;
            }
        }

        return max-1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        int n = scan.nextInt();
        int[] lines = new int[n];
        for(int i=0; i<k; i++) {
            lines[i] = scan.nextInt();
        }

        System.out.println(solution(k, n, lines));
    }
}
