package solution;

/*
JadeonCase 문자열 만들기
https://programmers.co.kr/learn/courses/30/lessons/12951?language=java
 */

import common.CommonUtil;

public class Solution12951 {
	public static void main(String[] args) {
		Solution12951 s1 = new Solution12951();
		System.out.println(s1.solution("3people unFollowed me"));

		Solution12951 s2 = new Solution12951();
		System.out.println(s2.solution("For The Last Week"));
	}

	public String solution(String s) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			if( i == 0 || s.charAt(i - 1) == ' ') {
				answer += Character.toUpperCase(s.charAt(i));
			} else {
				answer += Character.toLowerCase(s.charAt(i));
			}
		}

		return answer;
	}
}
