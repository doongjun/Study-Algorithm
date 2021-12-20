package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 17608 막대기
public class Stack5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++) {
            int h = Integer.parseInt(br.readLine());
            stack.add(h);
        }

        int standard = stack.pop();
        int count = 1;
        int current;
        while(!stack.isEmpty()) {
            current = stack.pop();
            if(current > standard) {
                standard = current;
                count++;
            }
        }
        System.out.println(count);
    }
}
