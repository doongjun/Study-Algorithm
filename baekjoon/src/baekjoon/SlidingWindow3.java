package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 1593 문자 해독
public class SlidingWindow3 {
	
	static int solution(int n, int m, String ns, String ms) {
        int answer = 0;

        HashMap<Character, Integer> nsMap = new HashMap<>();
        HashMap<Character, Integer> msMap = new HashMap<>();

        for(int i=0; i<n; i++) {
            nsMap.put(ns.charAt(i), nsMap.getOrDefault(ns.charAt(i), 0)+1);
        }

        int L = n-1;
        for(int i=0; i<L; i++) {
            msMap.put(ms.charAt(i), msMap.getOrDefault(ms.charAt(i), 0)+1);
        }

        int lt = 0;
        for(int rt=L; rt<m; rt++) {
            msMap.put(ms.charAt(rt), msMap.getOrDefault(ms.charAt(rt), 0)+1);
            if(msMap.equals(nsMap)) answer++;

            msMap.put(ms.charAt(lt), msMap.get(ms.charAt(lt))-1);
            if(msMap.get(ms.charAt(lt)) == 0) msMap.remove(ms.charAt(lt));

            lt++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String ns = br.readLine();
        String ms = br.readLine();
        System.out.println(solution(n, m, ns, ms));
    }
}
