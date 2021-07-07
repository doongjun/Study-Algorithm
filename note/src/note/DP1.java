package note;

//피보나치수
public class DP1 {
	static long[] d = new long[100]; 
	//시간복잡도 O(2^n)
	//탑다운
	public static int topdown(int x) {
		if(x==1 || x==2) {
			return 1;
		}
		return topdown(x-1) + topdown(x-2);
	}
	
	//바텀업
	//x번째 피보나치 수를 계산
	public static void bottomup(int x) {
		d[1] = 1;
		d[2] = 1;
		
		for(int i=3; i<=x; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		
		System.out.println(d[x]);
	}
	
	public static void main(String[] args) {
		System.out.println(topdown(4));
		bottomup(50);
	}

}
