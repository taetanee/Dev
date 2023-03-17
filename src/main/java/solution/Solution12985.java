package solution;

/*
GPT 도움 받음
https://school.programmers.co.kr/learn/courses/30/lessons/12985
 */

public class Solution12985 {
	public static void main(String[] args) {

		try {
			Solution12985 _s = new Solution12985();
			System.out.println(_s.solution(8,4,7));//3
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int solution(int n, int a, int b) {
		int answer = 0;

		int aTemp = a;
		int bTemp = b;

		while ( aTemp != bTemp){
			answer++;

			aTemp = (aTemp + 1 ) / 2;
			bTemp = (bTemp + 1 ) / 2;
		}

		return answer;
	}
}
