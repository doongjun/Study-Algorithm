package test;

import java.util.ArrayList;
import java.util.List;

//kakao 2020
public class StringCompression {

    public static void main(String[] args) {
        class Solution {
            public int solution(String s) {
                int answer = s.length();
                int length = s.length()/2;

                for(int i=1; i<=length; i++) {
                    List<String> str = new ArrayList<>();
                    List<Integer> cnt = new ArrayList<>();
                    int count = 1;
                    int pre = i;
                    str.add(s.substring(0, i));
                    for(int j=i+i; j<=s.length(); j+=i) {
                        String tmp = s.substring(pre, j);
                        if(str.get(str.size()-1).equals(tmp)) {
                            count++;
                        }else {
                            cnt.add(count);
                            count = 1;;
                            str.add(tmp);
                        }
                        pre = j;
                    }
                    if(pre != s.length()) {
                        str.add(s.substring(pre, s.length()));
                        cnt.add(1);
                    }
                    cnt.add(count);
                    StringBuffer stb = new StringBuffer();
                    for(int j=0; j<cnt.size(); j++) {
                        int tmpCnt = cnt.get(j);
                        if(tmpCnt > 1) {
                            stb.append(tmpCnt).append(str.get(j));
                        }else {
                            stb.append(str.get(j));
                        }
                    }
                    if(stb.toString().length() < answer) {
                        answer = stb.toString().length();
                    }
                }
                return answer;
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.solution("abcabcdede"));
    }

}
