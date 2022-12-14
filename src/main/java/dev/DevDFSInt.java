package dev;

/*
https://bcp0109.tistory.com/14
*/

public class DevDFSInt {
	public static void main(String[] args) {
		int n = 3;
		int[] arr = {1, 2, 3};
		int[] output = new int[n];
		boolean[] visited = new boolean[n];

		perm(arr, output, visited, 0, n, 3);

	}

	// 사전순으로 순열 구하기
	// 사용 예시: perm(arr, output, visited, 0, n, 3);
	static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if (depth == r) {
			print(output, r);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				output[depth] = arr[i];
				perm(arr, output, visited, depth + 1, n, r);
				visited[i] = false;
			}
		}
	}

	// 배열 출력
	static void print(int[] arr, int r) {
		for (int i = 0; i < r; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
