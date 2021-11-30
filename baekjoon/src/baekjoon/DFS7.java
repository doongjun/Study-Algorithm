package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

// 1987 알파벳
public class DFS7 {
    static int[][] dt = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static boolean[] visited = new boolean[26];
    static char[][] graph;
    static int r, c;
    static int answer = 0;
    static ArrayList<Character> rcd = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        graph = new char[r][c];

        for(int i=0; i<r; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j<c; j++) {
                graph[i][j] = line.charAt(j);
            }
        }

        dfs(0, 0, 1);
        System.out.println(answer);
    }

    static void dfs(int row, int col, int count) {
        visited[graph[row][col]-'A'] = true;

        for(int i=0; i<4; i++) {
            int nRow = row + dt[i][0];
            int nCol = col + dt[i][1];

            if(nRow < 0 || nRow >= r || nCol < 0 || nCol >= c) continue;
            if(!visited[graph[nRow][nCol]-'A']) {
                dfs(nRow, nCol, count+1);
            }
        }
        visited[graph[row][col]-'A'] = false;
        answer = Math.max(answer, count);
    }

}
