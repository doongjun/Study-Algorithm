package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 1475 방 번호
public class Implementation3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> map = new HashMap<>();
        String n = br.readLine();

        for(int i=1; i<10; i++) {
            map.put(Integer.toString(i).charAt(0), 0);
        }
        for(int i=0; i<n.length(); i++) {
            char a = n.charAt(i);
            if(a == '6' || a == '9') {
                if(map.get('6') < map.get('9')) {
                    map.put('6', map.getOrDefault('6', 0)+1);
                }else {
                    map.put('9', map.getOrDefault('9', 0)+1);
                }
            }else {
                map.put(a, map.getOrDefault(a, 0)+1);
            }
        }
        System.out.println(Collections.max(map.values()));
    }
}
