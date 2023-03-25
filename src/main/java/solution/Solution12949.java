package solution;

/*
행렬의 곱셈
https://school.programmers.co.kr/learn/courses/30/lessons/12949
참고링크 :
 */

public class Solution12949 {
	public static void main(String[] args) {

		try {
			Solution12949 _s = new Solution12949();
			System.out.println(_s.solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}}));//[[15, 15], [15, 15], [15, 15]]
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution12949 _s = new Solution12949();
			System.out.println(_s.solution(new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}, new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}}));//[[22, 22, 11], [36, 28, 18], [29, 20, 14]]
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[0].length; j++) {
				for (int z = 0; z < arr1[0].length; z++) {
					answer[i][j] += arr1[i][z] * arr2[z][j];
				}
			}
		}
		return answer;
	}
}
