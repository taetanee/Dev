package solution;

/*
배열 자르기
https://school.programmers.co.kr/learn/courses/30/lessons/120833
 */

public class Solution120833 {
	public static void main(String[] args) {

		try {
			Solution120833 s1 = new Solution120833();
			System.out.println(s1.solution(new int[]{1, 2, 3, 4, 5},1,3));//2,3,4
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution120833 s2 = new Solution120833();
			System.out.println(s2.solution(new int[]{1, 3, 5},1,2));//3,5
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2 - num1 + 1];

		int index = 0;
		for(int i=num1;i<=num2;i++){
			answer[index] = numbers[i];
			index++;
		}
		return answer;
	}
}
