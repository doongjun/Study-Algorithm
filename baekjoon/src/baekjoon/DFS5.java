package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 2667 단지번호붙이기
public class DFS5 {
    static int[][] dt = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int n;
    static boolean[][] visited;
    static int[][] graph;
    static int cnt;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> answer = new ArrayList<>();
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n][n];
        graph = new int[n][n];

        for(int i=0; i<n; i++) {
            String line = br.readLine();
            for(int j=0; j<n; j++) {
                graph[i][j] = line.charAt(j) - '0';
            }
        }
        int complexCnt = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(!visited[i][j] && graph[i][j] == 1) {
                    dfs(i, j);
                    answer.add(cnt);
                    cnt = 0;
                    complexCnt ++;
                }
            }
        }
        sb.append(complexCnt).append("\n");
        Collections.sort(answer);
        for(int i=0; i<answer.size(); i++) {
            sb.append(answer.get(i)).append("\n");
        }
        System.out.println(sb);
    }

    static int dfs(int col, int row) {
        visited[col][row] = true;

        for(int i=0; i<4; i++) {
            int nRow = row + dt[i][0];
            int nCol = col + dt[i][1];
            if(nRow < 0 || nRow >=  n || nCol < 0 || nCol >= n) continue;
            if(!visited[nCol][nRow] && graph[nCol][nRow] == 1) {
                dfs(nCol, nRow);
            }
        }
        return ++cnt;
    }
}
