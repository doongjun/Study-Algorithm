package test;

//4673 셀프넘버
public class BruteForce3 {
    public static void main(String[] args){
        boolean[] check = new boolean[10001];
        for(int i=1; i<10001; i++) {
            int result = d(i);
            if(result < 10001) check[result] = true;
        }
        StringBuffer sb = new StringBuffer();
        for(int i=1; i<10001; i++) {
            if(!check[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
    public static int d(int n) {
        int sum = n;

        while(n != 0) {
            sum = sum + (n%10);
            n = n/10;
        }

        return sum;
    }
}
