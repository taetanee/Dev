package solution;

/*
체육복
https://school.programmers.co.kr/learn/courses/30/lessons/42862

https://129212.tistory.com/101 참고해서 풀었음
 */

import java.util.Arrays;

public class Solution42862 {
	public static void main(String[] args) {

		try {
			Solution42862 s1 = new Solution42862();
			System.out.println(s1.solution(5,new int[]{2,4},new int[]{1,3,5})); //5
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution42862 s2 = new Solution42862();
			System.out.println(s2.solution(5,new int[]{2,4},new int[]{3})); //4
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution42862 s3 = new Solution42862();
			System.out.println(s3.solution(3,new int[]{3},new int[]{1})); //2
		} catch (Exception e){
			e.printStackTrace();
		}

	}
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		answer = n - (lost.length);
		Arrays.sort(reserve);
		Arrays.sort(lost);		/*  배열 원소값 크기 순으로 정렬  */

		/* 도난(+) 여벌(+) : 빌려줄 수 없음. 본인이 입어야 함. */
		for (int i=0; i<reserve.length; i++) {
			for (int j=0; j<lost.length; j++) {
				if ( reserve[i] == lost[j] ) {
					answer += 1;
					reserve[i] = -1;
					lost[j] = -1;
				}
			}
		}

		for (int i=0; i<reserve.length; i++) {
			for (int j=0; j<lost.length; j++) {
				if ( (reserve[i] != -1 && lost[j] != -1) )  {
					// 빌려줄 수 없는 애들 제외
					if ( reserve[i] - lost[j] == 1 || reserve[i] - lost[j] == -1 ) {
						// 앞 번호이거나 뒷 번호이다 (== 번호 차이가 1이다) => 빌려줄 수 있다
						reserve[i] = -1;
						lost[j] = -1;
						answer += 1;
					}
				}
			}
		}
		return answer;
	}
}
