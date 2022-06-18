package 커뮤러닝.week3;

import java.util.*;

/*
 * DFS 시간초과
 */
// 정수 삼각형(DP)
public class DP1 {
    
	int[][] graph;
    int level;
    int sumMax = 0;
    int sum;

    public void dfs(int nodeIdx, int level) {
        if(level==graph.length) {
            sumMax = Math.max(sum, sumMax);
        } else {
            sum += graph[level][nodeIdx];
            dfs(nodeIdx, level+1);
            sum -= graph[level][nodeIdx];

            sum += graph[level][nodeIdx+1];
            dfs(nodeIdx+1, level+1);
            sum -= graph[level][nodeIdx+1];
        }
    }
	
    public int solution(int[][] triangle) {
        int answer = 0;

        graph = triangle;
        sum = graph[0][0];

        dfs(0, 1);

        answer = sumMax;
        
        return answer;
    }
    
	public static void main(String[] args) {
		DP1 main = new DP1();
		
		int[][] triangle = {{7}, {3,8}, {8,1,0}, {2,7,4,4}, {4,5,2,6,5}};
		
		
		System.out.println(main.solution(triangle));
	}

}
