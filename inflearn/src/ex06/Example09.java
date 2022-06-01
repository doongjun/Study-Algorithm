package ex06;

import java.util.Scanner;

public class Example09 {
   public static int solution(int n, int m, int[] songs) {
       int answer = 0;

       int min = 0;
       int max = 0;
       for(int song : songs) {
           max += song;
       }

       while(min < max) {
           int mid = (min+max)/2;
           int sum = 0, count = 0;
           for(int song : songs) {
               int tmp = sum+song;
               if(tmp <= mid) {
                   sum += song;
               } else {
                   sum = song;
                   count++;
               }
           } 

           if(count >= m) {
               min = mid + 1;
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