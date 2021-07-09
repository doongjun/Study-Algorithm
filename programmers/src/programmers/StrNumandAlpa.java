package programmers;

//level1
//숫자 문자열과 영단어
public class StrNumandAlpa {

	public static void main(String[] args) {
		class Solution {
		    public int solution(String s) {
		        StringBuffer sb = new StringBuffer();
		        StringBuffer tmp = new StringBuffer();
		        
		        for(int i=0; i<s.length(); i++) {
		        	if(Character.isDigit(s.charAt(i))) {
		        		sb.append(s.charAt(i));
		        	}
		        	else {
		        		tmp.append(s.charAt(i));
		        		if(tmp.length()==3) {
		        			String num = tmp.toString();
		        			if(num.equals("one")) {
		        				sb.append("1");
		        				tmp.delete(0, tmp.length());
			        			continue;
		        			}
		        			else if(num.equals("two")) {
		        				sb.append("2");
		        				tmp.delete(0, tmp.length());
			        			continue;
		        			}
		        			else if(num.equals("six")) {
		        				sb.append("6");
		        				tmp.delete(0, tmp.length());
			        			continue;
		        			}
		        			
		        		}
		        		else if(tmp.length()==4) {
		        			String num = tmp.toString();
		        			if(num.equals("zero")) {
		        				sb.append("0");
		        				tmp.delete(0, tmp.length());
			        			continue;
		        			}
		        			else if(num.equals("four")) {
		        				sb.append("4");
		        				tmp.delete(0, tmp.length());
			        			continue;
		        			}
		        			else if(num.equals("five")) {
		        				sb.append("5");
		        				tmp.delete(0, tmp.length());
			        			continue;
		        			}
		        			else if(num.equals("nine")) {
		        				sb.append("9");
		        				tmp.delete(0, tmp.length());
			        			continue;
		        			}
		        		}
		        		else if(tmp.length()==5) {
		        			String num = tmp.toString();
		        			if(num.equals("three")) {
		        				sb.append("3");
		        				tmp.delete(0, tmp.length());
			        			continue;
		        			}
		        			else if(num.equals("seven")) {
		        				sb.append("7");
		        				tmp.delete(0, tmp.length());
			        			continue;
		        			}
		        			else if(num.equals("eight")) {
		        				sb.append("8");
		        				tmp.delete(0, tmp.length());
			        			continue;
		        			}
		        		}
		        	}
		        }
		        int answer = Integer.parseInt(sb.toString());
		        System.out.println(answer);
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		String str = "one4seveneight";
		s.solution(str);

	}

}
