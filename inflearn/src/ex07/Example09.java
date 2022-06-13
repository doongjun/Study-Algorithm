package ex07;

import java.util.LinkedList;
import java.util.Queue;

// Tree 말단 노드까지의 가장 짧은 경로
public class Example09 {
	Node root;
	
	/*
	 * DFS
	 */
	public int dfs(int L, Node root) {
		if(root.lt==null && root.rt==null) return L;
		else return Math.min(dfs(L+1, root.lt), dfs(L+1, root.rt));  
	}
	
	/*
	 * BFS
	 */
	public int bfs(int L, Node root) {
		
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i=0; i<size; i++) {
				Node node = queue.poll();
				
				if(node.lt==null && node.rt==null) return L;
				
				if(node.lt!=null) queue.offer(node.lt);
				if(node.rt!=null) queue.offer(node.rt);
			}
			L++;
		}
		
		return L;
	}
	
	public static void main(String[] args) {
		Example09 tree = new Example09();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		
		System.out.println("DFS : " + tree.dfs(0, tree.root));
		System.out.println("BFS : " + tree.bfs(0, tree.root));
	}
}

