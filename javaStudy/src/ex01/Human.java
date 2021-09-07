package ex01;

public class Human extends Animal{
	private String name;
	private double bloodPressure;
	
	public Human(String name, int bloodPressure) {
		this.name = name;
		this.bloodPressure = bloodPressure;
	}
	
	public String drinkAlcohol() {
		bloodPressure += 20;
		if(bloodPressure > 200) {
			return dead();
		}
		return "술을 먹습니다.";
	}
	
	@Override
	public String sleep() {
		bloodPressure = 120;
		return "잠을 잡니다";
	}
}
