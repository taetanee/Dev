package solution;

/*
문제제에에목
https://programmers.co.kr/learn/courses/30/lessons/xxxxx
 */

public class Solution120810 {
	public static void main(String[] args) {

		try {
			Solution120810 s1 = new Solution120810();
			System.out.println(s1.solution(3,2));//1
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution120810 s2 = new Solution120810();
			System.out.println(s2.solution(10,5));//0
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int solution(int num1, int num2) {
		int answer = num1 % num2;
		return answer;
	}
}
