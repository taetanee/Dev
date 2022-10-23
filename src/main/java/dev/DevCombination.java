package dev;

/**
 * 출처 : https://bcp0109.tistory.com/15
 */
public class DevCombination {
	public static void main(String[] args) {

		int n = 4;
		int arr[] = {1,2,3,4};
		boolean[] visited = new boolean[n];

		for (int i = 1; i <= n; i++) {
			System.out.println("["+n + " 개 중에서 " + i + " 개 뽑기"+"]");
			combination(arr, visited, 0, n, i);
		}

	}

	/**
	 * @param arr
	 * @param visited
	 * @param start
	 * @param n
	 * @param r
	 */
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
