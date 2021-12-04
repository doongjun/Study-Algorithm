package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 13458 시험감독
public class Math1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] people = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int main = Integer.parseInt(st.nextToken());
        int sub = Integer.parseInt(st.nextToken());

        long cnt = people.length;
        for(int i=0; i<people.length; i++) {
            people[i] -= main;
            if(people[i] > 0) {
                float tmp = (float)people[i]/sub;
                cnt += Math.ceil(tmp);
            }
        }

        System.out.println(cnt);
    }
}
