package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

//1927 최소힙
public class Heap1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            int x = Integer.parseInt(br.readLine());
            if(x > 0) {
                queue.add(x);
            }else if(x == 0) {
                if(queue.isEmpty()) {
                    bw.write(Integer.toString(x));
                }else {
                    bw.write(Integer.toString(queue.poll()));
                }
                bw.write("\n");
            }
        }
        bw.flush();
    }
}
