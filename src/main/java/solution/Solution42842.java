package solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
카펫
https://school.programmers.co.kr/learn/courses/30/lessons/42842?language=java
https://dev-ku.tistory.com/283 참고해서 풀었음
 */

public class Solution42842 {
	public static void main(String[] args) {
		//Solution42842 s1 = new Solution42842();
		//s1.solution(10, 2);

		Solution42842 s2 = new Solution42842();
		s2.solution(8, 1);

		//Solution42842 s3 = new Solution42842();
		//s3.solution(24, 24);
	}


	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];

		Set<ArrayList> possibleLists = new HashSet();
		int temp = brown + yellow;
		for (int i = 1; i <= temp; i++) {
			if( temp % i == 0){
				ArrayList<Integer> possibleList = new ArrayList();
				possibleList.add(i);
				possibleList.add(temp / i );
				possibleLists.add(possibleList);
			}
		}

		for (ArrayList arr : possibleLists) {
			int x = (int) arr.get(0);
			int y = (int) arr.get(1);
			if (x < y) {
				continue;
			}
			if ((x - 2) * (y - 2) == yellow) {
				answer[0] = x;
				answer[1] = y;
			}
		}

		return answer;
	}
}