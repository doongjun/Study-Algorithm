package baekjoon;

import java.util.Scanner;

// 10026
public class DFS8 {
    static int n;
    static char[][] map;
    static char[][] map2;
    static boolean[][] visited;
    static boolean[][] visited2;
    static int[][] dt = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public static void dfs2(int x, int y) {
        visited2[x][y] = true;

        for(int i=0; i<4; i++) {
            int nx = x + dt[i][0];
            int ny = y + dt[i][1];

            if(nx>=n || nx<0 || ny>=n || ny<0) continue;
            if(map2[x][y] == map2[nx][ny] && !visited2[nx][ny]) {
                dfs2(nx, ny);
            }
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0; i<4; i++) {
            int nx = x + dt[i][0];
            int ny = y + dt[i][1];

            if(nx>=n || nx<0 || ny>=n || ny<0) continue;
            if(map[x][y] == map[nx][ny] && !visited[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer1 = 0;
        int answer2 = 0;
        n = scan.nextInt();
        map = new char[n][n];
        map2 = new char[n][n];
        visited = new boolean[n][n];
        visited2 = new boolean[n][n];

        for(int i=0; i<n; i++) {
            String line = scan.next();
            for(int j=0; j<n; j++) {
                char color = line.charAt(j);
                map[i][j] = color;
                if(color == 'G') color = 'R';
                map2[i][j] = color;
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(!visited[i][j]) {
                    dfs(i, j);
                    answer1++;
                }

                if(!visited2[i][j]) {
                    dfs2(i, j);
                    answer2++;
                }
            }
        }

        System.out.println(answer1 + " " + answer2);
    }

}
