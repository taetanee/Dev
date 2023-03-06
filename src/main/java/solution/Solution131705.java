package solution;

/*
삼총사
https://school.programmers.co.kr/learn/courses/30/lessons/131705
 */

public class Solution131705 {


	public static int returnAnswer = 0;

	public static void main(String[] args) {

		try {
			Solution131705 _s = new Solution131705();
			System.out.println(_s.solution(new int[]{-2, 3, 0, 2, -5})); //2
		} catch (Exception e) {
			e.printStackTrace();
		}

//		try {
//			Solution131705 _s = new Solution131705();
//			System.out.println(_s.solution(new int[]{-3, -2, -1, 0, 1, 2, 3})); //5
//		} catch (Exception e){
//			e.printStackTrace();
//		}
//
//		try {
//			Solution131705 _s = new Solution131705();
//			System.out.println(_s.solution(new int[]{-1, 1, -1, 1})); //0
//		} catch (Exception e){
//			e.printStackTrace();
//		}
	}

	public int solution(int[] number) {
		//int answer = 0;

		int n = number.length;
		boolean[] visited = new boolean[n];
		combination(number, visited, 0, n, 3);

		return returnAnswer;
	}

	static public void combination(int arr[], boolean[] visited, int start, int n, int r) {
		if (r == 0) {
			print(arr, visited, n);
			return;
		}

		for (int i = start; i < n; i++) {
			visited[i] = true;
			combination(arr, visited, i + 1, n, r - 1);
			visited[i] = false;
		}
	}

	private static void print(int[] arr, boolean[] visited, int n) {
		int temp = 0;

		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				temp += arr[i];
			}
		}

		if( temp == 0 ){
			returnAnswer++;
		}
	}

}