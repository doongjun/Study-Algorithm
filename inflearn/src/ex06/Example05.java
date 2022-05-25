package ex06;

import java.util.HashSet;
import java.util.Scanner;

public class Example05 {

    static char solution(int n, int[] arr) {
        char answer = 'U';

        HashSet<Integer> set = new HashSet<>();
        for(int x : arr) {
            if(set.contains(x)) return 'D';

            set.add(x);
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

        System.out.print(solution(n, arr));
    }
}
