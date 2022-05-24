package ex06;

import java.util.Scanner;

public class Example03 {
    static int[] solution(int n, int[] arr) {

        for(int i=1; i<n; i++) {
            int target = i;
            for(int j=i-1; j>=0; j--) {
                if(arr[target] >= arr[j]) break;

                int tmp = arr[target];
                arr[target] = arr[j];
                arr[j] = tmp;
                target--;
            }
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