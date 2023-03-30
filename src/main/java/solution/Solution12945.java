package solution;

/*
피보나치 수
https://programmers.co.kr/learn/courses/30/lessons/12945
 */

public class Solution12945 {
	public static void main(String[] args) {
		Solution12945 s = new Solution12945();
		try {
			System.out.println(s.solution(5));
		} catch (Exception e){

		}
	}

	private int solution( int n ){
		int answer = 0;

		int a1 = 0;
		int a2 = 1;
		int a3 = 0;

		for( int i =2;i<=n;i++){
			a3 = (a1 + a2) % 1234567;
			a1 = a2 % 1234567;
			a2 = a3 % 1234567;
			answer = a3;
		}


		return answer;
	}

}
