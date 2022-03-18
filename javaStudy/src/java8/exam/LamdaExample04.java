package java8.exam;

public class LamdaExample04 {
	
	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			for (int i = 0; i < 30; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}

