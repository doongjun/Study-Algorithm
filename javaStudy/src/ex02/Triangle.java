package ex02;

public class Triangle extends Shape {
	Point a, b, c;
	
	int w;
	int h;
	public Triangle(int a, int h) {
		this.w = a;
		this.h = h;
	}
	
	@Override
	public void draw() {
		for(int i=0;i<h;i++){
			for(int j=0;j<w-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		}
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (w * h) / 2;
	}
	
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return w*3;
		
	}

	@Override
	Point getCenter() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
