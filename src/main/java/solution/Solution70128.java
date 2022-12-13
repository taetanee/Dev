package solution;

/*
내적

https://school.programmers.co.kr/learn/courses/30/lessons/70128
 */

public class Solution70128 {
	public static void main(String[] args) {

		Solution70128 s1 = new Solution70128();
		System.out.println(s1.solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2})); //3

		Solution70128 s2 = new Solution70128();
		System.out.println(s2.solution(new int[]{-1,0,1}, new int[]{1,0,-1})); //-2
	}

	public int solution(int[] a, int[] b) {
		int answer = 0;

		int length = a.length;
		for(int i=0;i<length;i++){
			answer += a[i] * b[i];
		}
		return answer;
	}
}
