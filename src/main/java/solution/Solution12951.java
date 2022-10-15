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

//	public String solution(String s) {
//		String answer = "";
//
//		boolean nextChar = true;
//		for( char c : s.toCharArray()) {
//			if(nextChar == true && c >= 'a' && c <= 'z'){
//				answer += (char) (c - 32);
//			} else if(nextChar == false && c >= 'A' && c <= 'Z'){
//				answer += (char) (c + 32);
//			} else {
//				answer += c;
//			}
//
//			if(c == ' '){
//				nextChar = true;
//			} else {
//				nextChar = false;
//			}
//
//		}
//		return answer;
//	}

	public String solution(String s) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			boolean upperFlag = false;
			char c = s.charAt(i);

			if (i == 0) {
				upperFlag = true;
			} else if (i >= 1 && s.charAt(i - 1) == ' ') {
				upperFlag = true;
			} else if (i >= 1 && s.charAt(i - 1) != ' ') {
				upperFlag = false;
			} else {
				upperFlag = false;
			}

			if (upperFlag == true) {
				answer += Character.toUpperCase(c);
			} else {
				answer += Character.toLowerCase(c);
			}
		}

		return answer;
	}
}
