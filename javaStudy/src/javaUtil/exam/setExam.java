package javaUtil.exam;

import java.util.*;

public class setExam {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		
		boolean flag1 = set1.add("kim");
		boolean flag2 = set1.add("bae");
		boolean flag3 = set1.add("bae");
		
		System.out.println(set1.size());
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		
		Iterator<String> iter = set1.iterator();
		
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	}
}
