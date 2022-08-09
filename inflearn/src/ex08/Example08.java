package ex08;

import java.util.Scanner;

// 8. 수열 추측하기
public class Example08 {
	static int[][] mem = new int[35][35];
	static int[] answer, per, com;
	static boolean[] used;
    static int n, f;

    public static int getNumOfFactorial(int num) {
        if(num==0 || num==1) return 1;
        else return num*getNumOfFactorial(num-1);
    }

    public static int getNumOfCombinations(int n, int r) {
    	if(mem[n][r]>0) return mem[n][r];
        return mem[n][r] = getNumOfFactorial(n)/(getNumOfFactorial(n-r)*getNumOfFactorial(r));
    }

    public static void solution() {
        for(int i=0; i<n; i++) {
            com[i] = getNumOfCombinations(n-1, i);
        }
        dfs(0);

        for(int x : answer) {
            System.out.print(x + " ");
        }
    }

    public static void dfs(int idx) {
        if(answer != null) {
            return;
        }

        if(idx == n) {
            int sum = 0;
            for(int i=0; i<n; i++) {
                sum += (per[i]*com[i]);
            }

            if(sum == f) {
                answer = per.clone();
            }

            return;
        } else {
            for(int i=1; i<=n; i++) {
                if(used[i]) continue;

                used[i] = true;
                per[idx] = i;
                dfs(idx+1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        f = scan.nextInt();
        per = new int[n];
        used = new boolean[n+1];
        com = new int[n];

        solution();
    }
}