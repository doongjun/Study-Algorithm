package note;

import java.util.Arrays;
import java.util.Scanner;

//나동빈
//음료수 얼려 먹기
public class DFS5 {
	public static int n,m;
	public static int[][] graph = new int[1000][1000];
	public static boolean dfs(int x, int y) {
		if(x<0 || x>=n || y<0 || y>=m) return false;
		
		if(graph[x][y]==0) {
			graph[x][y] = 3;
			dfs(x-1, y);
			dfs(x+1, y);
			dfs(x, y-1);
			dfs(x, y+1);
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		m = scan.nextInt();
		scan.nextLine();
		
		for(int i=0; i<n; i++) {
			String str = scan.nextLine();
			for(int j=0; j<m; j++) {
				graph[i][j] = str.charAt(j)-'0';
			}
		}
		
		int result = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(dfs(i,j)) {
					result++;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(graph[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(result);
	}

}
