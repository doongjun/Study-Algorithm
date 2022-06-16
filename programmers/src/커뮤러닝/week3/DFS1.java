package 커뮤러닝.week3;

import java.util.*;

// 올바른 괄호의 개수
public class DFS1 {
    HashMap<Character, Integer> map = new HashMap<>();
    ArrayList<Character> list = new ArrayList<>();
    int len;
    int count = 0;
    
    // 올바른 괄호인지 확인
    public boolean isCorrect(ArrayList<Character> list) {
        Stack<Character> stack = new Stack<>();

        for(Character c : list) {
            if(c == '(') stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        if(stack.size()==0) return true;
        else return false;
    }

    // DFS
    public void dfs(Character a) {
        list.add(a); // 누적
        if(list.size()==len && isCorrect(list)) {
            count++;
        } else {
            if(map.get('(') > 0) {
                map.put('(', map.get('(')-1); // 방문처리
                dfs('(');
                map.put('(', map.get('(')+1); // 복귀
                list.remove(list.size()-1);
            }

            if(map.get(')') > 0) {
                map.put(')', map.get(')')-1); // 방문처리
                dfs(')');
                map.put(')', map.get(')')+1); // 복귀
                list.remove(list.size()-1);
            }
        }
    }

    public int solution(int n) {
        int answer = 0;

        len = n*2;
        map.put(')', n);
        map.put('(', n-1);
        dfs('(');
        answer = count;
        return answer;
    }
    
	public static void main(String[] args) {
		DFS1 main = new DFS1();
		
		System.out.println(main.solution(3));
	}

}
