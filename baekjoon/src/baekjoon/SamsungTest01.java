package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 13460 구슬탈출vvv
public class SamsungTest01 {
	static char[][] board;
	static int[] oLocation = new int[2];
	static int[] rLocation = new int[2];
	static int[] bLocation = new int[2];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n =Integer.parseInt(st.nextToken());
		int m =Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		
		for(int i=0; i<n; i++) {
			String line = br.readLine();
			for(int j=0; j<m; j++) {
				char e = line.charAt(j);
				switch (e) {
					case 'O': {
						oLocation[0] = i;
						oLocation[1] = j;
						break;
					}
					case 'R': {
						rLocation[0] = i;
						rLocation[1] = j;
						break;
					}
					case 'B': {
						bLocation[0] = i;
						bLocation[1] = j;
						break;
					}
				}
				board[i][j] = line.charAt(j);
			}
		}
		
	}

}
