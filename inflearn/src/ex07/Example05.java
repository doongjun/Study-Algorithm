package ex07;

import java.util.LinkedList;
import java.util.Queue;

// 이진트리순회(DFS, BFS)
class Node {
	int data;
	Node lt, rt;
	public Node(int data) {
		this.data=data;
		lt=rt=null;
	}
}

public class Example05 {
	Node node;
	
	/*
	 * DFS
	 */
	public void dfs(Node root) {
		if(root==null) return;
		else {
			// 전위순회
			dfs(root.lt);
			// 중위순회
			dfs(root.rt);
			// 후위순회
			System.out.print(root.data + " "); 
		}
	}
	
	/*
	 * BFS
	 */
	public void bfs(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		int level = 0;
		while(!queue.isEmpty()) {
			System.out.print(level + " : ");
			int len = queue.size();
			for(int i=0; i<len; i++) {
				Node cur = queue.poll();
				System.out.print(cur.data + " ");
				if(cur.lt != null) queue.offer(cur.lt);
				if(cur.rt != null) queue.offer(cur.rt);
			}
			level++;
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Example05 tree = new Example05();
		tree.node = new Node(1);
		tree.node.lt = new Node(2);
		tree.node.rt = new Node(3);
		tree.node.lt.lt = new Node(4);
		tree.node.lt.rt = new Node(5);
		tree.node.rt.lt = new Node(6);
		tree.node.rt.rt = new Node(7);
		
		tree.dfs(tree.node);
		System.out.println();
		tree.bfs(tree.node);
	}

}