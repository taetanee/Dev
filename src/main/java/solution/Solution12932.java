package solution;

/*
자연수 뒤집어 배열로 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */

public class Solution12932 {

	public static void main(String[] args) {
		Solution12932 s1 = new Solution12932();
		s1.solution(12345);
	}

	public int[] solution(long n) {
		String str = String.valueOf(n);
		int[] answer = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			answer[str.length() - i - 1] = str.charAt(i) - '0';
		}
		return answer;
	}
}
