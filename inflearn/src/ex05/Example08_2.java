package ex05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// queue
// 8.응급실
class Person {
	int id;
	int priority;
	
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Example08_2 {
	static int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		Queue<Person> q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			q.offer(new Person(i, arr[i]));
		}
		
		while(!q.isEmpty()) {
			Person person = q.poll();
			for(Person waiting : q) {
				if(waiting.priority > person.priority) {
					q.offer(person);
					person = null;
					break;
				}
			}
			
			if(person != null) {
				answer++;
				if(person.id == m) return answer;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(solution(n, m, arr));
	}
}

