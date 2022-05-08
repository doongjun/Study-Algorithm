package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 1620 나는야 포켓몬 마스터 이다솜
public class HashMap3 {
	static Map<Integer, String> book1 = new HashMap<>();
	static Map<String, Integer> book2 = new HashMap<>();
	
	static String findPoketmonByNum(int num) {
		return book1.get(num);
	}
	
	static int findPoketmonByString(String name) {
		return book2.get(name);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());		
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			book1.put(i, name);
			book2.put(name, i);
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			String info = st.nextToken();
			boolean isNumeric = info.chars().allMatch( Character::isDigit );
			
			if(isNumeric) {
				System.out.println(findPoketmonByNum(Integer.parseInt(info)));
			} else {
				System.out.println(findPoketmonByString(info));
			}
		}
	}

}
