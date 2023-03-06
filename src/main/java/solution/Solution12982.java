package solution;

/*
예산
https://school.programmers.co.kr/learn/courses/30/lessons/12982
 */

import java.util.Arrays;

public class Solution12982 {
	public static void main(String[] args) {

		try {
			Solution12982 s1 = new Solution12982();
			System.out.println(s1.solution(new int[]{1,3,2,5,4}, 9)); //3
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution12982 s2 = new Solution12982();
			System.out.println(s2.solution(new int[]{2, 2, 3, 3}, 10)); //4
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);

		int tempBudget = budget;
		for (int i = 0; i < d.length; i++) {
			if( tempBudget - d[i] < 0 ){
				return answer;
			}
			tempBudget = tempBudget - d[i];
			answer ++;
		}

		return answer;
	}
}
