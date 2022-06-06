package ex07;

// 부분집합구하기(DFS)
public class Example06 {
	static int n;
	static boolean[] check;
	
	public static void dfs(int l) {
		if(l > n) {
			StringBuilder sb = new StringBuilder();
			for(int i=1; i<=n; i++) {
				if(check[i]) sb.append(i).append(" ");
			}
			if(!sb.isEmpty()) System.out.println(sb.toString());
		} else {
			check[l] = true;
			dfs(l+1);
			check[l] = false;
			dfs(l+1);
		}
	}
	
	public static void main(String[] args) {
		n = 3;
		check = new boolean[n+1];
		
		dfs(1);
	}
}

