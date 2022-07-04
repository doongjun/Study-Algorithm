package ex08;

import java.util.Scanner;

// 2.바둑이 승차(DFS)
public class Example02 {
    static int answer = Integer.MIN_VALUE ;
    static int c, n;
    static int[] arr;

    public static void dfs(int depth, int sum) {
    	if(sum>c) return;
        if(depth==n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(depth+1, sum+arr[depth]);
            dfs(depth+1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        c = scan.nextInt();
        n = scan.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        dfs(0, 0);

        System.out.println(answer);
    }
}
