package programmers;

import java.util.Arrays;

//비밀지도
public class SecretMap {

	public static void main(String[] args) {
		class Solution {
		    public String[] solution(int n, int[] arr1, int[] arr2) {
		        String[] answer = new String[n];
		        String[] board1 = new String[n];
		        String[] board2 = new String[n];
		        
		        for(int i=0; i<n; i++) {
		        	StringBuffer sb1 = new StringBuffer();
		        	StringBuffer sb2 = new StringBuffer();
		        	String binaryString1 = Integer.toBinaryString(arr1[i]);
		        	String binaryString2 = Integer.toBinaryString(arr2[i]);
		        	
		        	for(int j=0; j<n-binaryString1.length(); j++) {
		        		sb1.append('0');
		        	}
		        	for(int j=0; j<n-binaryString2.length(); j++) {
		        		sb2.append('0');
		        	}
		        	sb1.append(binaryString1);
		        	sb2.append(binaryString2);
		        	board1[i] = sb1.toString();
		        	board2[i] = sb2.toString();
		        }
		        
		        
		        for(int i=0; i<n; i++) {
		        	StringBuffer answersb = new StringBuffer();
		        	for(int j=0; j<n; j++) {
		        		char a = board1[i].charAt(j);
		        		char b = board2[i].charAt(j);
		        		
		        		if(a=='0' && b=='0') 
		        			answersb.append(' ');
		        		else
		        			answersb.append('#');
		        	}
		        	answer[i] = answersb.toString();
		        }
		        
		        System.out.println(Arrays.toString(answer));
		        
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		s.solution(n, arr1, arr2);

	}

}
