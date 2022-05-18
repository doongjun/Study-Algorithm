package ex05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// queue
// 8.응급실
class Patient {
	int id;
	int priority;
	
	public Patient(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
	
	public int getId() {
		return id;
	}
	
	public int getPriority() {
		return priority;
	}
}

public class Example08_1 {
	static int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		Queue<Patient> line = new LinkedList<>();
		for(int i=0; i<n; i++) {
			line.offer(new Patient(i, arr[i]));
		}
		
		while(!line.isEmpty()) {
			Patient patient = line.poll();
			int patientPriority = patient.getPriority();
			Iterator<Patient> iter = line.iterator();
			boolean offerYn = false;
			while(iter.hasNext()) {
				if(iter.next().getPriority() > patientPriority) {
					line.offer(patient);
					offerYn = true;
					break;
				}
			}
			
			if(!offerYn) {
				answer++;
				if(patient.getId() == m) {
					return answer;
				}
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

