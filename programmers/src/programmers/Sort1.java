package programmers;

import java.util.Arrays;
import java.util.Comparator;

//가장 큰 수
//Comparator사용
public class Sort1 {

	public static void main(String[] args) {
		class Solution {
		    public String solution(int[] numbers) {
		        String answer = "";
		        
		        String[] arr = new String[numbers.length];
		        
		        for(int i=0; i<numbers.length; i++) {
		        	arr[i] = Integer.toString(numbers[i]);
		        }
		        
		        Arrays.sort(arr, new Comparator<String>() {
		        	@Override
		        	public int compare(String s1, String s2) {
		        		return (s2+s1).compareTo(s1+s2);
		        	}
		        });
		        
		        if(arr[0].equals("0")) return "0";
		        
		        for(int i=0; i<arr.length; i++) {
		        	answer += arr[i];
		        }
		        
		        System.out.println(answer);
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		
		int[] numbers = {3, 30, 34, 5, 9};
 		s.solution(numbers);

	}

}
