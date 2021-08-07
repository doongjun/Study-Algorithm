package javaUtil.exam;

public class LambdaExam {

	public static void main(String[] args) {
		//람다 표현식
		new Thread(()-> {
				for(int i=0; i<10; i++) {
					System.out.println("hello");
			}
		}).start();
		
		/*
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("hello");
				}
			}
		}).start();*/

	}

}
