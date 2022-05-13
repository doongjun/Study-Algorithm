package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 17298 오큰수
public class Stack8 {
    static int[] solution(int n, int[] A) {
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++) {
            while(!stack.isEmpty() && A[i] > A[stack.peek()]) {
                answer[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        while(!stack.empty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        for(int i=0; i<n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for(int x : solution(n, A)) {
            sb.append(x).append(" ");
        }
        System.out.println(sb.toString());
    }
}

