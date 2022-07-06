package ex08;

import java.util.Scanner;

// 6.순열 구하기(DFS)
public class Example06 {
	static int n;
	static int m;
	static int[] arr;
	static int[] pm;
	static boolean[] used;
	
	public static void dfs(int depth) {
		if(depth == m) {
			for(int p : pm) {
				System.out.print(p + " ");
			}
			System.out.println();
		} else {
			for(int i=0; i<n; i++) {
				if(!used[i]) {
					pm[depth] = arr[i];
					used[i] = true;
					dfs(depth+1);
					used[i] = false;
				}
			}
		}
	}
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();
        used = new boolean[n];
        arr = new int[n];
        for(int i=0; i<n; i++) {
        	arr[i] = scan.nextInt();
        }
        
        pm = new int[m];
        
        dfs(0);
    }
}
