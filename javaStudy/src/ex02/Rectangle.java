package ex02;

public class Rectangle extends Shape{
	int w;
	int h;
	
	public Rectangle(int a, int h) {
		this.w = a;
		this.h = h;
	}
	
	@Override
	public void draw() {
		for(int i = 0; i < w; i++) {
			for(int j = 0; j < h; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return w*h;
	}
	
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(w+h);
	}

	@Override
	Point getCenter() {
		
		return null;
	}
	
	
}
