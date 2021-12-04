package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//2941 크로아티아 알파벳
public class Implementation2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<word.length(); i++) {
            stack.push(word.charAt(i));
        }

        int count = 0;
        while(!stack.isEmpty()) {
            char x = stack.pop();
            if(x == '=') {
                char y = stack.pop();
                if(y == 'z') {
                    if(!stack.isEmpty()) {
                        if(stack.peek() == 'd') {
                            stack.pop();
                        }
                    }
                }
            }else if(x == '-') {
                stack.pop();
            }else if(x == 'j') {
                if(!stack.isEmpty()) {
                    if(stack.peek() == 'l' || stack.peek() == 'n') {
                        stack.pop();
                    }
                }
            }
            count ++;
        }
        System.out.println(count);
    }
}
