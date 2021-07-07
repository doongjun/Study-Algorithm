package note;

import java.util.Scanner;

//나동빈
//상하좌우
//그리디x 구현
public class Greedy5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		scan.nextLine(); //버퍼 비우기
		String[] plans = scan.nextLine().split(" ");
		
		int[] dx = {0, 0, -1, 1};
		int[] dy = {-1, 1, 0, 0};
		char[] move_types = {'L','R','U','D'};
		
		int x = 1, y = 1;
		
		for(int i=0; i<plans.length; i++) {
			char plan = plans[i].charAt(0);
			int nx = 0, ny = 0;
			for(int j=0; j<move_types.length; j++) {
				if(plan == move_types[j]) {
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}
			
			if(nx<1 || nx>N || ny<1 || ny>N) continue;
			x = nx;
			y = ny;
		}
		
		System.out.println(x + " " + y);

	}

}
