package programmers;

import java.util.*;
//level1
//신규 아이디 추천
public class CommendID {

	public static void main(String[] args) {
		class Solution {
		    public String solution(String new_id) {
		        //1단계
		        new_id = new_id.toLowerCase();
		        
		        ArrayList<Character> arr = new ArrayList<>();
		        
		        //2단계
		        for(int i=0; i<new_id.length(); i++) {
		        	char tmp = new_id.charAt(i);
		        	if(Character.isDigit(tmp) || (tmp>='a' && tmp<='z') || tmp=='.' || tmp=='-' || tmp=='_') {
		        		arr.add(tmp);
		        	}		        	
		        }
		        
		        
		        //3단계
		        int cnt = 0;
		        for(int i=0; i<arr.size()-1; i++) {
		        	if(arr.get(i)=='.') {
		        		if(arr.get(i+1)=='.')
		        			arr.set(i, '@');
		        	}
		        	
		        }
		        ArrayList<Character> temp = new ArrayList<>();
		        temp.add('@');
		        arr.removeAll(temp);
		        
		        //4단계
		        while(true) {
		        	if(arr.size()==1) {
		        		arr.clear();
		        		break;
		        	}
		        	if(arr.get(0)=='.') {
		        		arr.remove(0);
		        	}
		        	if(arr.get(arr.size()-1)=='.') {
		        		arr.remove(arr.size()-1);
		        	}
		        	if(arr.get(0)!='.' && arr.get(arr.size()-1)!='.')
		        		break;
		        }

		        //5단계
		        if(arr.size()==0) {
		        	arr.add('a');
		        }
		        
		        //6단계
		        if(arr.size()>=16) {
		        	while(true) {
			        	arr.remove(arr.size()-1);
			        	if(arr.size()<16)
			        		break;
			        }
			        while(true) {
			        	if(arr.get(arr.size()-1)=='.') {
			        		arr.remove(arr.size()-1);
			        	}
			        	else
			        		break;
			        }
		        }
		        
		        //7단계
		        if(arr.size()<=2) {
		        	while(true) {
		        		arr.add(arr.get(arr.size()-1));
		        		if(arr.size()==3)
		        			break;
		        	}
		        }
		        
		        StringBuffer sb = new StringBuffer();
		        for(int i=0; i<arr.size(); i++) {
		        	sb.append(arr.get(i));
		        }
		        String answer = sb.toString();
		        
		        System.out.println(answer);
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		String new_id = "=.=";
		s.solution(new_id);
	}

}
