package ex02;

public class Circle extends Shape{
	private static final double P = 3.14f;
	int r;
	
	Circle(int r){
		this.r = r;
	}
	
	@Override
	public void draw() {
		int x, y;
		for(x=-2*r; x<=2*r; x+=2) {
			for(y=-r; y<=r; y++) {
				if((x*x + y*y) >= r*r-r/1.3 && (x*x + y*y) <= r*r+r/1.3)
					System.out.print("*");
			    else
			    	System.out.print(" ");
			    }
			
			    System.out.println("");
			  }
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return P*r*r;
	}
	
	
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * P * r;
	}

	@Override
	Point getCenter() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
