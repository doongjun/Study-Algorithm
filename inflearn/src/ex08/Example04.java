package ex08;

import java.util.Scanner;

// 4.중복순열 구하기(DFS)
public class Example04 {
	static int n;
	static int m;
	static int[] pm;
	
	public static void dfs(int depth) {
		if(depth == m) {
			for(int p : pm) {
				System.out.print(p + " ");
			}
			System.out.println();
		} else {
			for(int i=1; i<=n; i++) {
				pm[depth] = i;
				dfs(depth+1);
			}
		}
	}
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();
        
        pm = new int[m];
        
        dfs(0);
    }
}
