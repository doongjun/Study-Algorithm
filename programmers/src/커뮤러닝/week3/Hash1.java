package 커뮤러닝.week3;

import java.util.HashMap;

// 위장(해시)
public class Hash1 {
	public static int solution(String[][] clothes) {
		int answer = 1;
		
		HashMap<String, Integer> closet = new HashMap<>();
        for(int i=0; i<clothes.length; i++) {
            String type = clothes[i][1];
            closet.put(type, closet.getOrDefault(type, 0)+1);
        }

        for(String key : closet.keySet()) {
            answer *= (closet.get(key)+1);
        }
		
		return answer-1;
	}
	public static void main(String[] args) {
		String[][] clothes = {
				{"yellowhat", "headgear"}, 
				{"bluesunglasses", "eyewear"}, 
				{"green_turban", "headgear"}
			};
		
		System.out.println(solution(clothes));
	}

}
