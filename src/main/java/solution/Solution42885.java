package solution;

/*
구명보트
https://school.programmers.co.kr/learn/courses/30/lessons/42885
https://kunduz.tistory.com/367 (참고해서 풀었음)
 */

import java.util.Arrays;

public class Solution42885 {
	public static void main(String[] args) {

		try {
			Solution42885 s1 = new Solution42885();
			System.out.println(s1.solution(new int[]{70, 50, 80, 50},100));//3
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution42885 s2 = new Solution42885();
			System.out.println(s2.solution(new int[]{70, 80, 50},100));//3
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);
		int index = 0;
		for (int i = people.length - 1; i >= 0; i--) {
			if (index > i) {
				break;
			}
			if (people[i] + people[index] <= limit) {
				index++;
			}
			answer++;
		}
		return answer;
	}
}
