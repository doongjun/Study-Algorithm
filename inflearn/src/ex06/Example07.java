package ex06;

import java.util.Scanner;

class Node {
    int x;
    int y;
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Example07 {
    static String solution(int n, Node[] node) {
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<n; i++) {
            int j;
            Node target = node[i];

            for(j=i-1; j>=0; j--) {
                if(node[j].x > target.x || node[j].x == target.x && node[j].y > target.y) {
                    node[j+1] = node[j];
                } else {
                    break;
                }
            }
            node[j+1] = target;
        }

        for(int i=0; i<n; i++) {
            sb.append(node[i].x).append(" ").append(node[i].y).append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Node[] node = new Node[n];
        for(int i=0; i<n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            node[i] = new Node(x, y);
        }

        System.out.println(solution(n, node));
    }
}
