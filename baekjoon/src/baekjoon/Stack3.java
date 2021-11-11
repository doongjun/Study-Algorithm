package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

//4949 균형잡힌 세상
public class Stack3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String input = br.readLine();
            if(input.equals(".")) {
                break;
            }
            bw.write(solution(input)+"\n");
        }
        bw.flush();
    }

    public static String solution(String input) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<input.length(); i++) {
            Character chr = input.charAt(i);
            if(chr == '[' || chr == '(') {
                stack.push(chr);
            }else if(chr == ')') {
                if(stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                }else {
                    stack.pop();
                }
            }else if(chr == ']') {
                if(stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                }else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) {
            return "yes";
        }else {
            return "no";
        }
    }
}
