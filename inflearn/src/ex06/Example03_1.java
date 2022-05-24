package ex06;

import java.util.Scanner;

public class Example03_1 {
    static int[] solution(int n, int[] arr) {
        int i, j, target;
        for(i=1; i<n; i++) {
            target = arr[i];
            for(j=i-1; j>=0 && arr[j]>target; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = target;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        for(int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}