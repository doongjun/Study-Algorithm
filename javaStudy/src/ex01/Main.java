package ex01;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Human human = new Human("John", 120);
		
		System.out.println(animal.born());
		System.out.println(animal.addAge());
		System.out.println(animal.addAge());
		
		System.out.println(human.drinkAlcohol());
		System.out.println(human.drinkAlcohol());
		System.out.println(human.drinkAlcohol());
		System.out.println(human.drinkAlcohol());
		System.out.println(human.sleep());
		System.out.println(human.drinkAlcohol());
		
	}
}
