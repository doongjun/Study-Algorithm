package javaStudy;

//스트링 클래스의 문제점
public class StringProblem {

	public static void main(String[] args) {
		//str1방법
		//이 방법은 내부적으로 StringBuffer 클래스를 계속 생성하기 때문에 비효율적
		String str1 = "";
		for(int i=0; i<100; i++) {
			str1 += "*";
		}
		System.out.println(str1);
		
		//StringBuffer 생성자를 생성하고 append한 후 String으로 변환
		//이 방법이 훨씬 더 효율적
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<100; i++) {
			sb.append("*");
		}
		String str2 = sb.toString();
		System.out.println(str2);

	}

}
