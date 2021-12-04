package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//kakao 2019
public class OpenChat {
    public static void main(String[] args) {
        class Solution {
            public String[] solution(String[] record) {
                List<List<String>> ans = new ArrayList<>();
                Map<String, String> map = new HashMap<>();
                for(String x : record) {
                    String[] rcrd = x.split(" ");
                    switch (rcrd[0]) {
                    case "Enter":
                        map.put(rcrd[1], rcrd[2]);
                        ans.add(Arrays.asList(rcrd[1], "Enter"));
                        break;
                    case "Leave":
                        ans.add(Arrays.asList(rcrd[1], "Leave"));
                        break;
                    case "Change":
                        map.put(rcrd[1], rcrd[2]);
                        break;
                    }
                }
                String[] answer = new String[ans.size()];
                for(int i=0; i<answer.length; i++) {
                    String userId = ans.get(i).get(0);
                    String behavior = ans.get(i).get(1);
                    switch (behavior) {
                    case "Enter":
                        answer[i] = map.get(userId) + "님이 들어왔습니다.";
                        break;
                    case "Leave":
                        answer[i] = map.get(userId) + "님이 나갔습니다.";
                        break;
                    }
                }

                return answer;
            }
        }
        Solution solution = new Solution();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(solution.solution(record));
    }
}
