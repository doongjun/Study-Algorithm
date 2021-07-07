package note;

import java.util.Scanner;

//나동빈
//시각
public class Implementation1 {
	public static boolean check(int h, int m, int s) {
		if(h%10==3 || m/10==3 || m%10==3 || s/10==3 || s%10==3) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int res = 0;
		//내 풀이
		/*
		for(int h=0; h<=N; h++) {
			String hh = Integer.toString(h);
			for(int m=0; m<60; m++) {
				String mm = Integer.toString(m);
				for(int s=0; s<60; s++) {
					String ss = Integer.toString(s);
					String time = hh+mm+ss;
					for(int i=0; i<time.length(); i++) {
						if(time.charAt(i)=='3') {
							res++;
							break;
						}
					}
				}
			}
		}
		*/
		
		//정답풀이
		for(int i=0; i<=N; i++) {
			for(int j=0; j<60; j++) {
				for(int k=0; k<60; k++) {
					if(check(i,j,k)) res++;
				}
			}
		}

		System.out.println(res);


	}

}
