package ex02;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Triangle(10, 10);
		System.out.println("정삼각형의 면적:"+shape.getArea());
		System.out.println("정삼각형의 둘레:"+shape.getPerimeter());
		shape.draw();
		
		
		System.out.println();

		shape = new Rectangle(4, 5);
		System.out.println("직사각형의 면적:"+shape.getArea());
		System.out.println("직사각형의 둘레:"+shape.getPerimeter());
		shape.draw();
		
		System.out.println();
		
		shape = new Circle(10);
		System.out.println("원의 면적:"+shape.getArea());
		System.out.println("원의 둘레:"+shape.getPerimeter());
		shape.draw();
	}

}
