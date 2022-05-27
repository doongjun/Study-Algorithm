package ex06;

import java.util.Scanner;

public class Example07_1 {
    static String solution(int n, int[] x, int[] y) {
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<n; i++) {
            int j;
            int xt = x[i];
            int yt = y[i];
            for(j=i-1; j>=0; j--) {
                if(x[j] > xt) {
                    x[j+1] = x[j];
                    y[j+1] = y[j];
                } else if(x[j] == xt) {
                    if(y[j] > yt) {
                        x[j+1] = x[j];
                        y[j+1] = y[j];
                    } else break;
                } else break;
            }
            x[j+1] = xt;
            y[j+1] = yt;
        }

        for(int i=0; i<n; i++) {
            sb.append(x[i]).append(" ").append(y[i]).append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i=0; i<n; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }

        System.out.println(solution(n, x, y));
    }

}
