package javaUtil.exam;

public class ThreadExam {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
		//Thread 동작 시 run()이 아닌 start() 호출
		t1.start();
		t2.start();
		
		System.out.println("main end!!");
	}

}
