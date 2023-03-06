package dev;

/**
 * 출처 : https://bcp0109.tistory.com/15
 */
public class DevCombination {
	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		boolean[] visited = new boolean[n];

		combination(arr, visited, 0, n, 4);

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
		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}
