package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//10828
public class Stack1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Stack<Integer> stack = new Stack<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String cmd = st.nextToken();
			if(cmd.equals("push")) {
				int val = Integer.parseInt(st.nextToken());
				//System.out.println(val);
				stack.push(val);
			}
			else if(cmd.equals("pop")) {
				if(stack.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(stack.pop()).append('\n');
			}
			else if(cmd.equals("size")) {
				sb.append(stack.size()).append('\n');
			}
			else if(cmd.equals("empty")) {
				if(stack.isEmpty())
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
			}
			else if(cmd.equals("top")) {
				if(stack.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(stack.peek()).append('\n');
			}
		}
		br.close();
		
		System.out.println(sb);
	}

}
