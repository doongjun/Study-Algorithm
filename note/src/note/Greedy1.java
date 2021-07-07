package note;

//나동빈
//거스름돈
public class Greedy1 {

	public static void main(String[] args) {
		int n = 1260;
		int[] coins = {500, 100, 50, 10};

		int cnt = 0;
		for(int coin : coins) {
			cnt += n/coin;
			n %= coin;
		}
		System.out.println(cnt);

	}

}
