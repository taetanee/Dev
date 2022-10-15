package solution;

import java.util.LinkedList;

public class SolutionGnapuoc_1_2 {

	static int N;    // 정점
	static int M;    // 간선
	static int count;        // 연결 요소의 개수
	static int graph[];    // 무방향 그래프
	static boolean visit[];    // 방문 여부 체크


	public static void main(String[] args) {
		SolutionGnapuoc_1_2 s1 = new SolutionGnapuoc_1_2();
		System.out.println(s1.solution(new int[]{3, 1, 2, 4}));

		SolutionGnapuoc_1_2 s2 = new SolutionGnapuoc_1_2();
		System.out.println(s2.solution(new int[]{2, 3, 4, 5, 1}));

		SolutionGnapuoc_1_2 s3 = new SolutionGnapuoc_1_2();
		System.out.println(s3.solution(new int[]{1, 2, 3, 4, 5, 6}));
	}

	public int solution(int[] rooms) {
		int answer = 0;

		LinkedList<Integer> linkedList = new LinkedList();
		for (int i = 0; i < rooms.length; i++) {
			linkedList.add(i, rooms[i]);
		}

		return answer;
	}
}
