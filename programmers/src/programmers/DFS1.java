package test;

public class DFS1 {
    static boolean[] visited;
    static int[][] graph;
    public static void main(String[] args) {
        class Solution {
            void dfs(int x){
                visited[x] = true;
                for(int i=0; i<graph[x].length; i++){
                    if(x == i) continue;
                    if(graph[x][i]==1 && !visited[i]){
                        dfs(i);
                    }
                }
            }

            public int solution(int n, int[][] computers) {
                int answer = 0;
                visited = new boolean[n];
                graph = computers;

                for(int i = 0; i < n; i++){
                    for(int j = 0; j < n; j++){
                        if(computers[i][j] == 1 && !visited[j]){
                            dfs(j);
                            answer++;
                        }
                    }
                }

                return answer;
            }
        }

        Solution solution = new Solution();
        int n = 3;
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(solution.solution(n, computers));
    }
}
