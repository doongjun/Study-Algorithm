package javaUtil.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		//시작
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		
		//2021.07.23 at 04:12:02 오후 KST
		System.out.println(ft.format(date));
		
		System.out.println(date.getTime());
		
		long today = System.currentTimeMillis();
		//끝
		
		System.out.println(today);
		
		//시작 - 끝 사이에 걸린 시간
		System.out.println(today - date.getTime());
	}

}
