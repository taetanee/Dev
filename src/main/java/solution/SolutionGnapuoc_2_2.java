package solution;

public class SolutionGnapuoc_2_2 {

	public static void main(String[] args) {
		SolutionGnapuoc_2_2 s1 = new SolutionGnapuoc_2_2();
		System.out.println(s1.solution(new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5, 6}, 20));
	}

	public int solution(int[] A, int S) {
		int answer = -1;

		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum = 0;
			for (int j = i; j + i <= A.length; j++) {
				sum += A[j];
				System.out.println("");
			}
		}

		return answer;
	}
}
