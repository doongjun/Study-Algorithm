package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 14465 소가 길을 건너간 이유5
public class SlidingWindow2 {
	static int solution(int n, int k, int b, boolean[] brokenTr) {
        int answer = Integer.MAX_VALUE;

        int cnt = 0;
        for(int i=1; i<k; i++) {
            if(brokenTr[i]) cnt++;
        }

        int lt = 1;
        for(int rt=k; rt<=n; rt++) {
            if(brokenTr[rt]) cnt++;
            answer = Math.min(answer, cnt);

            if(brokenTr[lt++]) cnt--;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean[] brokenTr = new boolean[n+1];

        for(int i=0; i<b; i++) {
            int num = Integer.parseInt(br.readLine());
            brokenTr[num] = true;
        }

        System.out.println(solution(n, k, b, brokenTr));
    }

}
