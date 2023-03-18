package solution;

/*
괄호 회전하기
https://school.programmers.co.kr/learn/courses/30/lessons/76502
참고링크 :
 */

import java.util.Stack;

public class Solution76502 {
	public static void main(String[] args) {

//		try {
//			Solution76502 _s = new Solution76502();
//			System.out.println(_s.solution("[](){}")); //3
//		} catch (Exception e){
//			e.printStackTrace();
//		}
//
//		try {
//			Solution76502 _s = new Solution76502();
//			System.out.println(_s.solution("}]()[{")); //2
//		} catch (Exception e){
//			e.printStackTrace();
//		}

		try {
			Solution76502 _s = new Solution76502();
			System.out.println(_s.solution("[)(]")); //0
		} catch (Exception e){
			e.printStackTrace();
		}

//		try {
//			Solution76502 _s = new Solution76502();
//			System.out.println(_s.solution("}}}")); //0
//		} catch (Exception e){
//			e.printStackTrace();
//		}
	}

	public int solution(String s) {
		int answer = 0;

		for(int i=0;i<s.length();i++){
			if( i != 0 ){
				s = s.substring(1, s.length()) + s.substring(0, 1);
			}


			if ( isVaild(s) == true ) {
				answer++;
			}

		}
		return answer;
	}

	public boolean isVaild(String s){
		Stack<Character> stack = new Stack();

		for( int i =0; i<s.length() ;i++){
			char rawData = s.charAt(i);
			if( stack.empty() ){
				stack.push(rawData);
			} else if ( stack.peek() == '{' && rawData == '}'){
				stack.pop();
			} else if ( stack.peek() == '[' && rawData == ']'){
				stack.pop();
			} else if ( stack.peek() == '(' && rawData == ')'){
				stack.pop();
			} else {
				stack.push(rawData);
			}
		}

		if (stack.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
