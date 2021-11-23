package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 11724 연결 요소의 개수
public class DFS3 {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        graph = new ArrayList<ArrayList<Integer>>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        for(int i=0; i<n+1; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        int count = 0;
        for(int i=1; i<graph.size(); i++) {
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    static void dfs(int node) {
        visited[node] = true;
        for(int i=0; i<graph.get(node).size(); i++) {
            int next = graph.get(node).get(i);
            if(!visited[next]) dfs(next);
        }

    }
}
