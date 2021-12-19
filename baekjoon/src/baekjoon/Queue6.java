package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 2161 카드1
public class Queue6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<n+1; i++) {
            queue.offer(i);
        }

        boolean flag = false;
        while(queue.size() != 1) {
            if(!flag) {
                System.out.println(queue.poll());
                flag = true;
                continue;
            }
            queue.add(queue.poll());
            flag = false;
        }
        System.out.println(queue.poll());
    }
}
