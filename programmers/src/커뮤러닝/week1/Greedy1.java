package 커뮤러닝.week1;

import java.util.LinkedList;
import java.util.Queue;

// 기지국 설치
public class Greedy1 {
	public static int solution(int n, int[] stations, int w) {
		int answer = 0;
//		Queue<Integer> sq = new LinkedList<>();
//		for(int s : stations) sq.offer(s);
		int stationsIdx = 0;
		
		int position = 1;
		while(position <= n) {
//			if(!sq.isEmpty() && sq.peek()-w <= position) {
//				position = sq.poll()+w+1;
//			} else {
//				answer++;
//				position += w*2+1;
//			}
			
			if(stationsIdx < stations.length && stations[stationsIdx]-w <= position) {
				position = stations[stationsIdx++]+w+1;
			} else {
				answer++;
				position += w*2+1;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int n = 11;
		int[] stations = {4, 11};
		int w = 1;
		
		System.out.println(solution(n, stations, w));
	}

}
