package baekjoon;

import java.util.Scanner;

// 2805 나무자르기
public class BinarySearch3 {
    static int solution(int n, int m, int[] trees) {
       int min = 0, max = 0;
       for(int h : trees) {
           max = Math.max(max, h);
       }

       int mid;
       long sum;
       while(min < max) {
           mid = (max+min)/2;

           sum = 0;
           for(int h : trees) {
               if(h > mid) {
                   sum += (h-mid);
               }
           }

           if(sum >= m) {
               min = mid+1;
           } else {
               max = mid;
           }
       }

        return min-1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] trees = new int[n];
        for(int i=0; i<n; i++) {
            trees[i] = scan.nextInt();
        }

        System.out.println(solution(n, m, trees));
    }

}
