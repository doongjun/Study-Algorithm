package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

//1966 프린터 큐
public class Queue3 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            LinkedList<ArrayList<Integer>> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                queue.offer(new ArrayList<>(Arrays.asList(j, Integer.parseInt(st.nextToken()))));
            }

            int count = 0;
            while(!queue.isEmpty()) {
                ArrayList<Integer> front = queue.poll();
                boolean isMax = true;
                for(int j=0; j<queue.size(); j++) {
                    if(queue.get(j).get(1) > front.get(1)) {
                        queue.offer(front);
                        for(int k=0; k<j; k++) {
                            queue.offer(queue.poll());
                        }
                        isMax = false;
                        break;
                    }
                }
                if(isMax == false) continue;

                count++;
                if(front.get(0) == m) {
                    break;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
