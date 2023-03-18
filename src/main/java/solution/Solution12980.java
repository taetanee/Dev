package solution;

/*
점프와 순간 이동
https://school.programmers.co.kr/learn/courses/30/lessons/12980
https://jongwoon.tistory.com/157 : 참고하여 풀었음
 */

public class Solution12980 {
	public static void main(String[] args) {

//		try {
//			Solution12980 _s = new Solution12980();
//			System.out.println(_s.solution(5));//2
//		} catch (Exception e){
//			e.printStackTrace();
//		}
//
//		try {
//			Solution12980 _s = new Solution12980();
//			System.out.println(_s.solution(6));//2
//		} catch (Exception e){
//			e.printStackTrace();
//		}
//
		try {
			Solution12980 _s = new Solution12980();
			System.out.println(_s.solution(5000));//5
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int solution(int n) {
		int result = 0;
		while( n != 0){
			if((n % 2 ) == 0){
				n = n >> 1;
			} else {
				n--;
				result++;
			}
		}
		return result;
	}
}
