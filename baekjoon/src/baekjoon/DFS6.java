package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2468 안전 영역
public class DFS6 {
    static int n;
    static int[][] dt = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static boolean[][] visited;
    static int[][] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        graph = new int[n][n];

        int max = 0;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                int h = Integer.parseInt(st.nextToken());
                graph[i][j] = h;
                if(h > max) max = h;
            }
        }

        int landMax = 0;
        for(int h=0; h<max; h++) {
            visited = new boolean[n][n];
            int cnt = 0;
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    if(!visited[i][j] && graph[i][j] > h) {
                        dfs(i, j, h);
                        cnt++;
                    }
                }
            }
            if(cnt > landMax) {
                landMax = cnt;
            }
        }
        System.out.println(landMax);
    }

    static void dfs(int col, int row, int h) {
        visited[col][row] = true;

        for(int i=0; i<4; i++) {
            int nRow = row + dt[i][0];
            int nCol = col + dt[i][1];

            if(nRow < 0 || nRow >= n || nCol < 0 || nCol >= n) continue;
            if(!visited[nCol][nRow] && graph[nCol][nRow] > h) dfs(nCol, nRow, h);
        }
    }
}
