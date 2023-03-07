package solution;

/*
크기가 작은 부분 문자열
https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */

public class Solution147355 {
	public static void main(String[] args) {

		try {
			Solution147355 _s = new Solution147355();
			System.out.println(_s.solution("3141592", "271"));//2
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution147355 _s = new Solution147355();
			System.out.println(_s.solution("500220839878","7"));//8
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution147355 _s = new Solution147355();
			System.out.println(_s.solution("10203","15"));//3
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int solution(String t, String p) {
		int answer = 0;
		int tLength = t.length();
		int pLength = p.length();
		int lengthTemp = tLength - pLength + 1;

		for (int i = 0; i < lengthTemp; i++) {
			if (Double.parseDouble(p) >= Double.parseDouble(t.substring(i, pLength + i))) {
				answer++;
			}
		}

		return answer;
	}
}
