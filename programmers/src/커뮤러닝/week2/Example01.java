package 커뮤러닝.week2;

import java.util.Arrays;

// 티셔츠
public class Example01 {
	public int solution(int[] people, int[] tshirts) {
        int answer = 0;

        Arrays.sort(people);
        Arrays.sort(tshirts);

        int p = 0;
        for(int t=0; t<tshirts.length && p<people.length; t++) {
            if(tshirts[t] >= people[p]) {
                p++;
                answer++;
            }
        }

        return answer;
    }

	public static void main(String[] args) {
		Example01 ex = new Example01();
		int[] people = {2, 3};
		int[] thirts = {1, 2, 3};
		System.out.println(ex.solution(people, thirts));
	}

}
