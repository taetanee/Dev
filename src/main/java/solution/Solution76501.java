package solution;

/*
음양 더하기
https://school.programmers.co.kr/learn/courses/30/lessons/76501
 */

public class Solution76501 {
	public static void main(String[] args) {

		Solution76501 s1 = new Solution76501();
		System.out.println(s1.solution(new int[]{4,7,12}, new boolean[]{true,false,true}));//9

		Solution76501 s2 = new Solution76501();
		System.out.println(s2.solution(new int[]{1,2,3}, new boolean[]{false,false,true}));//0
	}

	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;

		for(int i=0;i<absolutes.length;i++){
			if(signs[i] == true){
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}
		}
		return answer;
	}
}
