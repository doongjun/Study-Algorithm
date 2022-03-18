package java8.exam;

public class LamdaExample02 {
	
	public static void exec(Sum sum) {
		int k = 10;
		int m = 20;
		int value = sum.sumValue(k, m);
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		exec((i, j)->{
			return i+j;
		});
	}
}

interface Sum {
	public int sumValue(int a, int b);
}

