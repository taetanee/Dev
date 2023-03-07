package solution;

/*
숫자 문자열과 영단어
https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */

public class Solution81301 {
	public static void main(String[] args) {

		try {
			Solution81301 _s = new Solution81301();
			System.out.println(_s.solution("one4seveneight"));//1478
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution81301 _s = new Solution81301();
			System.out.println(_s.solution("23four5six7"));//234567
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution81301 _s = new Solution81301();
			System.out.println(_s.solution("2three45sixseven"));//234567
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution81301 _s = new Solution81301();
			System.out.println(_s.solution("123"));//123
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution81301 _s = new Solution81301();
			System.out.println(_s.solution("onetwo"));//12
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int solution(String s) {
		int answer = 0;
		String[] alphabetArray = new String []{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String sTemp = s;

		for (int i = 0; i < alphabetArray.length; i++) {
			sTemp = sTemp.replace(alphabetArray[i], Integer.toString(i));
		}
		answer = Integer.parseInt(sTemp);

		return answer;
	}
}
