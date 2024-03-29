package dev;

/**
 * 출처 : https://bcp0109.tistory.com/14
 */
public class DevPermutation {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int n = arr.length;
		int[] output = new int[n];
		boolean[] visited = new boolean[n];

		permutation(arr, output, visited, 0, n, 3);
	}

	// 사전순으로 순열 구하기
	// 사용 예시: permutation(arr, output, visited, 0, n, 3);
	static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if (depth == r) {
			print(output, r);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (visited[i] != true) {
				visited[i] = true;
				output[depth] = arr[i];
				permutation(arr, output, visited, depth + 1, n, r);
				visited[i] = false;
			}
		}
	}

	static void print(int[] arr, int r) {
		for (int i = 0; i < r; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
