package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 1012 유기능 배추
public class DFS4 {
    static ArrayList<ArrayList<Integer>> graph;
    static int[][] dt = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static boolean[][] visited;
    static int w, h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            visited = new boolean[h][w];

            graph = new ArrayList<ArrayList<Integer>>();
            for(int j=0; j<h; j++) {
                graph.add(new ArrayList<Integer>());
                for(int k=0; k<w; k++) {
                    graph.get(j).add(0);
                }
            }

            for(int j=0; j<c; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph.get(y).set(x, 1);
            }
            int count = 0;
            for(int j=0; j<h; j++) {
                for(int k=0; k<w; k++) {
                    if(!visited[j][k] && graph.get(j).get(k) == 1) {
                        dfs(k, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void dfs(int x, int y) {
        visited[y][x] = true;

        for(int i=0; i<4; i++) {
            int nx = x + dt[i][0];
            int ny = y + dt[i][1];
            if(nx < 0 || nx >= w || ny < 0 || ny >= h) continue;
            if(!visited[ny][nx] && graph.get(ny).get(nx) == 1) {
                dfs(nx, ny);
            }
        }
    }

}
