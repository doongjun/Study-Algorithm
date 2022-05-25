package ex06;

import java.util.Scanner;

public class Example04 {

    static int[] solution(int s, int n, int[] arr) {
        int[] cache = new int[s];

        for(int i=0; i<n; i++) {
            int task = arr[i];
            int cacheIdx = s-1;
            for(int j=0; j<s; j++) {
                if(task == cache[j]) {
                    cacheIdx = j;
                }
            }

            for(int j=cacheIdx-1; j>=0; j--) {
                cache[j+1] = cache[j];
            }
            cache[0] = task;
        }

        return cache;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        for(int x : solution(s, n, arr)) {
            System.out.print(x + " ");
        }
    }
}
