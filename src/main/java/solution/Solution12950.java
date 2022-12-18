package solution;

/*
행렬의 덧셈
https://school.programmers.co.kr/learn/courses/30/lessons/12950
 */

public class Solution12950 {
	public static void main(String[] args) {

		try {
			Solution12950 s1 = new Solution12950();
			System.out.println(s1.solution(new int[][]{{1,2},{2,3}},new int[][]{{3,4},{5,6}}));//[[4,6],[7,9]]
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution12950 s2 = new Solution12950();
			System.out.println(s2.solution(new int[][]{{1},{2}},new int[][]{{3},{4}}));//[[4],[6]]
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int[][] solution(int[][] arr1, int[][] arr2) {

		int iLength = arr1.length;
		int jLength = arr1[0].length;

		int[][] answer = new int[iLength][jLength];

		for(int i=0;i<iLength;i++){
			for(int j=0;j<jLength;j++){
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		return answer;
	}
}
