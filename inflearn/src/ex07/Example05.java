package ex07;

// 이진트리순회(DFS)
public class Example05 {
	Node node;
	public void dfs(Node root) {
		if(root==null) return;
		else {
			dfs(root.lt);
			dfs(root.rt);
			System.out.print(root.data + " "); // 후위순회
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
	}

}

class Node {
	int data;
	Node lt, rt;
	public Node(int data) {
		this.data=data;
		lt=rt=null;
	}
}
