package 커뮤러닝.week2;

import java.util.Arrays;

// 상담예약제
public class Example02 {
	public int plus10Minute(String[] time) {
		int hh = Integer.parseInt(time[0]);
		int mm = Integer.parseInt(time[1])+10;
		if(mm > 59) {
			mm = mm-60;
			hh++;
		}
		
		String zero = "";
		if(mm < 10) zero = "0";
		
		String result = hh + zero + mm;
		return Integer.parseInt(result);
	}
	
	public int getTime(String[] time) {
		return Integer.parseInt((time[0]+time[1]));
	}
	
	public String[] solution(String[][] booked, String[][] unbooked) {
        String[] answer = new String[booked.length+unbooked.length];
        int answerPoint = 0;
        int endTime = 0;	
        int b=0, ub=0;
        while(b<booked.length && ub<unbooked.length) {
        	int bTime = getTime(booked[b][0].split(":"));
        	int ubTime = getTime(unbooked[ub][0].split(":"));
        	
        	if(ubTime < bTime && bTime > endTime) {
        		answer[answerPoint++] = unbooked[ub][1];
        		endTime = plus10Minute(unbooked[ub][0].split(":"));
        		ub++;
        	} else {
        		answer[answerPoint++] = booked[b][1];
        		endTime = plus10Minute(booked[b][0].split(":"));
        		b++;
        	}
        }
        
        for(int i=b; i<booked.length; i++) {
        	answer[answerPoint++] = booked[i][1];
        }
        
        for(int i=ub; i<unbooked.length; i++) {
        	answer[answerPoint++] = unbooked[i][1];
        }
        
        return answer;
    }

	public static void main(String[] args) {
		Example02 ex = new Example02();
		String[][] booked = {{"09:10", "lee"}};
		String[][] unbooked = {{"09:00", "kim"}, {"09:05", "bae"}};
		
		for(String name : ex.solution(booked, unbooked)) {
			System.out.print(name + " ");
		}
	}

}
