package ex01;

public class Animal {
	private double age;
	private boolean live;
	
	public String born() {
		this.live = true;
		return "태어난다";
	}
	
	public double addAge() {
		return this.age += 1;
	}
	
	public String sleep() {
		return "잠을 잡니다.";
	}
	
	public String dead() {
		this.live = false;
		return "사망한다";
	}
}