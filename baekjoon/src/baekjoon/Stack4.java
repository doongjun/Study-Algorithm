package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 10799 쇠막대기
public class Stack4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        Stack<Character> stack = new Stack<>();
        int answer = 0;

        for(int i=0; i<line.length(); i++) {
            char bracket = line.charAt(i);
            if(bracket == '(') {
                stack.add(bracket);
                continue;
            }
            stack.pop();
            if(line.charAt(i - 1) == '(') {
                answer += stack.size();
            }else {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
