package ex08;

import java.util.Arrays;
import java.util.Scanner;

// 10. 미로탐색
public class Example10 {
	static int answer = 0;
    static int[][] dt = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
    static int[][] graph = new int[7][7];
    static boolean[][] visited = new boolean[7][7];

    public static void dfs(int row, int col) {
        if(row == 6 && col == 6) {
            answer++;
            return;
        } else {
            for(int i=0; i<4; i++) {
                int nRow = row + dt[i][0];
                int nCol = col + dt[i][1];

                if(nRow<0 || nRow>6 || nCol<0 || nCol>6) continue;
                if(graph[nRow][nCol] == 1) continue;
                if(visited[nRow][nCol]) continue;
                
                visited[row][col] = true;
                dfs(nRow, nCol);
                visited[row][col] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<7; i++) {
            String[] elements = scan.nextLine().split(" ");

            for(int j=0; j<elements.length; j++) {
                graph[i][j] = Integer.parseInt(elements[j]);
            }
            
        }

        dfs(0, 0);

        System.out.println(answer);
    }
}