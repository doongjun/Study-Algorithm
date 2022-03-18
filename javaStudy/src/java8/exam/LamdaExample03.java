package java8.exam;

public class LamdaExample03 {
	
	public interface MyNumber {
		int getMax(int num1, int num2);
	}
	
	public static void main(String[] args) {
		MyNumber max = (x,y)->(x>=y)? x:y;
		System.out.println(max.getMax(10, 30));
	}
}

