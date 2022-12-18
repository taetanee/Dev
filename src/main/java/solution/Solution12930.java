package solution;

/*
이상한 문자 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/12930
 */

public class Solution12930 {
	public static void main(String[] args) {

		try {
			Solution12930 s1 = new Solution12930();
			//System.out.println(s1.solution("try hello world"));
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution12930 s2 = new Solution12930();
			System.out.println(s2.solution("_try hello world")); //_tRy HeLlO WoRlD
		} catch (Exception e){
			e.printStackTrace();
		}

	}

	public String solution(String s) {
		String answer = "";
		String[] str = s.split("");

		int idx = 0;
		for(int i=0; i<str.length; i++) {

			if(str[i].equals(" ")) {
				idx = 0;
			} else if(Character.isAlphabetic( str[i].charAt(0) ) == false ) {
				str[i] = str[i];
			} else if(idx % 2 == 0) {
				str[i] = str[i].toUpperCase();
				idx++;
			} else if(idx % 2 != 0) {
				str[i] = str[i].toLowerCase();
				idx++;
			}
			answer += str[i];
		}

		return answer;
	}

}
