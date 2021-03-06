package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//DFS와 BFS
public class BFSandDFS {
	static int N;
	static int M;
	static int V;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	static boolean[] dfsvisited;
	static boolean[] bfsvisited;
	
	public static void dfs(int node) {
		dfsvisited[node] = true;
		System.out.print(node +" ");
		
		for(int i=0; i<graph.get(node).size(); i++) {
			int next = graph.get(node).get(i);
			if(!dfsvisited[next]) {
				dfs(next);
			}
		}
	}
	
	public static void bfs(int node) {
		Queue<Integer> queue = new LinkedList<>();
		bfsvisited[node] = true;
		queue.offer(node);
		
		while(!queue.isEmpty()) {
			int x = queue.poll();
			System.out.print(x + " ");
			
			for(int i=0; i<graph.get(x).size(); i++) {
				int y = graph.get(x).get(i);
				if(!bfsvisited[y]) {
					queue.offer(y);
					bfsvisited[y]=true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		M = scan.nextInt();
		V = scan.nextInt();
		dfsvisited = new boolean[N+1];
		bfsvisited = new boolean[N+1];
		for(int i=0; i<=N; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<M; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();	
			
			graph.get(v).add(u);
			graph.get(u).add(v);
		}
		
		dfs(V);
		System.out.println();
		bfs(V);
		//System.out.println(graph);
	}

}
