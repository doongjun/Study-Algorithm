package note;

import java.util.Scanner;

//나동빈
//1이 될 때까지
public class Greedy2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		//내 풀이(개선)
		int cnt = 0;
		while(true) {
			int target = (n/k)*k;
			cnt += (n-target);
			n = target;
			
			if(n<k) break;
			
			n /= k;
			cnt++;
		}
		cnt += (n-1);
		System.out.println(cnt);
		
		//내 풀이
		/*
		int cnt = 0;
		while(n!=1) {
			if(n%k==0) {
				n /= k;
				cnt++;
			}
			else {
				n -= 1;
				cnt++;
			}
		}
		System.out.println(cnt);
		*/
		
		//나동빈 풀이
		/*
		int result = 0;
		while (true) {
            // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            int target = (n / k) * k;
            result += (n - target);
            n = target;
            // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (n < k) break;
            // K로 나누기
            result += 1;
            n /= k;
        }

        // 마지막으로 남은 수에 대하여 1씩 빼기
        result += (n - 1);
        System.out.println(result);
		*/

	}

}
