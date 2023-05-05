package solution;

/*
문제제에에목
https://programmers.co.kr/learn/courses/30/lessons/xxxxx
참고링크 :
 */

public class SolutionTenretnimuz_1 {
	public static void main(String[] args) {

		try {
			SolutionTenretnimuz_1 _s = new SolutionTenretnimuz_1();
			System.out.println(_s.solution(2));//3
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			SolutionTenretnimuz_1 _s = new SolutionTenretnimuz_1();
			System.out.println(_s.solution(3));//12
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			SolutionTenretnimuz_1 _s = new SolutionTenretnimuz_1();
			System.out.println(_s.solution(100000));
		} catch (Exception e){
			e.printStackTrace();
		}
	}

//	public long solution(long n) {
//		int answer = 0;
//		for (int i = 1; i < n * n; i++) {
//			if( i / n == i % n ){
//				answer += i;
//			}
//		}
//		return answer;
//	}

	public long solution(long n) {
		long answer = 0;
		for (int i = 1; i <= n; i++) {
			answer += (n * (i - 1)) + (i -1);
		}
		return answer;
	}
}
