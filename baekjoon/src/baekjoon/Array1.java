package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

//3052
public class Array1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();

		for(int i=0; i<10; i++) {
			int tmp = scan.nextInt();
			set.add(tmp%42);
		}
		System.out.println(set.size());
		
		

	}

}
