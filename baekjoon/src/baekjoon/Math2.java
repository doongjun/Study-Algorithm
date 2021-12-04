package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2455 기차
public class Math2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		int train = 0;
		int max = 0;
		for(int i=0; i<4; i++) {
			st = new StringTokenizer(br.readLine());
			train = train - Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

			if(train > max) {
				max = train;
			}
		}
		System.out.println(max);
	}
}
