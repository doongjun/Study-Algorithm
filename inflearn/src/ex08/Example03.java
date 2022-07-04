package ex08;

import java.util.Scanner;

// 3.최대점수 구하기(DFS)
class Problem {
    int score;
    int time;
    public Problem(int score, int time) {
        this.score = score;
        this.time = time;
    }
}

public class Example03 {
    static int answer = 0;
    static int n, m;
    static Problem[] problems;

    public static void dfs(int depth, int totalScore, int totalTime) {
    	if(totalTime>m) return;
        if(depth==n) {
            answer = Math.max(answer, totalScore);
        } else {
            dfs(depth+1, totalScore+problems[depth].score, totalTime+problems[depth].time);
            dfs(depth+1, totalScore, totalTime);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();
        problems = new Problem[n];
        for(int i=0; i<n; i++) {
            int score = scan.nextInt();
            int time = scan.nextInt();

            problems[i] = new Problem(score, time);
        }

        dfs(0, 0, 0);

        System.out.println(answer);
    }
}
