package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 1764 듣보잡
public class HashMap2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> names = new HashSet<>();
        for(int i=0; i<n; i++) {
            String name = br.readLine();
            names.add(name);
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<m; i++) {
            String name = br.readLine();
            if(names.contains(name)) {
                ans.add(name);
            }
        }
        Collections.sort(ans);
        sb.append(ans.size()).append("\n");
        for(int i=0; i<ans.size(); i++) {
            sb.append(ans.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
