package java8.exam;

public class LamdaExample01 {
	public static void main(String[] args) {
		Person john = new Person();
		john.hi(new Say() {
			@Override
			public int something(int a, int b) {
				System.out.println("My Name is John");
				System.out.println("Nice to meet you");
				System.out.println("parameter number is "+a+","+b);
				return a+b;
			}
		});
		
		System.out.println();
		
		Person bob = new Person();
		bob.hi((a, b) -> {
			System.out.println("My Name is John");
			System.out.println("Lamda");
			System.out.println("parameter number is "+a+","+b);
			return a+b;
		});
	}
}

@FunctionalInterface
interface Say {
	int something(int a, int b);
}

class Person {
	public void hi(Say line) {
		int number = line.something(3, 4);
		System.out.println("Number is " + number);
	}
}
