package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2751 수 정렬하기2
public class Sort4 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        boolean[] chk = new boolean[2000001];
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
        	int k = Integer.parseInt(br.readLine());
        	chk[k + 1000000] = true;
        }
        
        for(int i=0; i<chk.length; i++) {
        	if(chk[i]) {
        		sb.append((i-1000000)).append("\n");
        	}
        }
        System.out.println(sb.toString());
        
    }

}