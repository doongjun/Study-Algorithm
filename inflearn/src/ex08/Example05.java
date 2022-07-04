package ex08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 5.동전교환(DFS)
public class Example05 {
    static int answer = Integer.MAX_VALUE;
    static int n, m;
    static Integer[] types;

    public static void dfs(int count, int sum) {
    	if(sum > m) return;
    	if(count >= answer) return;
        if(sum == m) {
            answer = Math.min(answer, count);
            return;
        } else {
            for(int i=0; i<n; i++) {
            	dfs(count+1, sum+types[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        types = new Integer[n];
        for(int i=0; i<n; i++) {
            types[i] = scan.nextInt();
        }
        m = scan.nextInt();
        Arrays.sort(types, Collections.reverseOrder());
        dfs(0, 0);

        System.out.println(answer);
    }
}
