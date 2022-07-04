package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 2178
class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class BFS1 {
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;
    static int[][] dt = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public static void bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0));
        visited[0][0] = true;

        while(!queue.isEmpty()) {
            Node node = queue.poll();

            for(int i=0; i<4; i++) {
                int nx = node.x + dt[i][0];
                int ny = node.y + dt[i][1];

                if(nx>=n || nx<0 || ny>=m || ny<0) continue;
                if(map[nx][ny] != 0 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    map[nx][ny] = map[node.x][node.y] + 1;
                    queue.offer(new Node(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();
        map = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i<n; i++) {
            String line = scan.next();
            for(int j=0; j<m; j++) {
                map[i][j] = line.charAt(j)-'0';
            }
        }

        bfs();

        System.out.println(map[n-1][m-1]);
    }
}
