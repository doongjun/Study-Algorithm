package ex06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
	public int x;
	public int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) return this.y - o.y;
		else return this.x - o.x;
	}
}

public class Example07_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            list.add(new Point(x, y));
        }
        
        Collections.sort(list);
        for(Point o : list) {
        	System.out.println(o.x + " " + o.y);
        }
    }

}
