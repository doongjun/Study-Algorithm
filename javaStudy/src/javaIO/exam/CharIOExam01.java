package javaIO.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharIOExam01 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			line = br.readLine();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
