package note;

import java.util.ArrayList;
import java.util.Scanner;

//문자열
//그룹 단어 체커
public class String1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String[] str = new String[n];
		
		for(int i=0; i<n; i++){
			str[i] = scan.next();
		}
		int cnt = 0;
		for(int i=0; i<n; i++) {
			ArrayList<Character> arr = new ArrayList<>();
			arr.add(str[i].charAt(0));
			boolean bol = true;
			for(int j=1; j<str[i].length(); j++) {
				if(arr.get(arr.size()-1)==str[i].charAt(j)) continue;
				arr.add(str[i].charAt(j));
				for(int k=0; k<arr.size()-1; k++) {
					if(str[i].charAt(j)==arr.get(k)) {
						bol = false;
						break;
					}
				}
			}
			if(bol) cnt++;
			//System.out.println(arr + " " + bol);
		}
		
		System.out.println(cnt);
	}

}
