package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 2493 탑
public class Stack7 {
    static class Top {
        int h;
        int d;
        public Top(int h, int d) {
            this.h = h;
            this.d = d;
        }

        public int getD() {
            return d;
        }

        public int getH() {
            return h;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Stack<Top> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int top = Integer.parseInt(st.nextToken());

            while(!stack.isEmpty()) {
                if(stack.peek().getH() >= top) {
                    sb.append(stack.peek().getD()+1).append(" ");
                    break;
                } else {
                    stack.pop();
                }
            }
            if(stack.isEmpty()) {
                sb.append("0 ");
            }

            stack.push(new Top(top, i));
        }

        System.out.println(sb.toString());
    }
}