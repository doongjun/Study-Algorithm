package note;

import java.util.Arrays;
import java.util.Scanner;

public class Implementation2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String inputData = scan.nextLine();
		int row = inputData.charAt(1) - '0';
		int col = inputData.charAt(0) - 'a' + 1;
		
		int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
		int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
		
		int result = 0;
		for(int i=0 ;i<dx.length; i++) {
			int nx = row + dx[i];
			int ny = col + dy[i];
			
			if(nx<1 || nx>8 || ny<1 || ny>8) continue;
			
			result++;
		}
		
		System.out.println(result);
	}

}
