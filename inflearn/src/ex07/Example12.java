package ex07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 그래프 최단거리(BFS) level
public class Example12 {
	static int n, m;
	static int[] answer;
	static ArrayList<ArrayList<Integer>> graph;
	static boolean[] visited;
	
	static public void bfs(int node) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(node);
		visited[node] = true;
		int level = 0;
		while(!queue.isEmpty()) {
			int length = queue.size();
			for(int i=0; i<length; i++) {
				int v = queue.poll();
				answer[v] = level;
				for(int x : graph.get(v)) {
					if(!visited[x]) {
						queue.offer(x);
						visited[x] = true;
					}
				}
			}
			level++;
		}
		
	}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        n = scan.nextInt();
        m = scan.nextInt();
        answer = new int[n+1];
        visited = new boolean[n+1];
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++) {
        	graph.add(new ArrayList<Integer>());
        }
        
        for(int i=0; i<m; i++) {
        	int x = scan.nextInt();
        	int y = scan.nextInt();
        	graph.get(x).add(y);
        }
        
        bfs(1);
        
        for(int i=2; i<answer.length; i++) {
        	System.out.println(i + " : " + answer[i]);
        }
    }
}

/* TC
 *
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
 *
 */