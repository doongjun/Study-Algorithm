package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

// 2512
public class BinarySearch4 {
    public static boolean isOk(int[] arr, int maximum, int budget) {
        int sum = IntStream.of(arr).map(a -> Math.min(a, maximum)).sum();
        if(sum <= budget) return true;
        return false;
    }

    public static int solution(int n, int budget, int[] arr) {
        int answer = 0;
        int min = 0, max = Arrays.stream(arr).max().getAsInt();

        while(min <= max) {
            int mid = (min+max)/2;
            if(isOk(arr, mid, budget)) {
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
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int m = scan.nextInt();

        System.out.println(solution(n, m, arr));
    }
}

/*
4
120 110 140 150
485
 */
