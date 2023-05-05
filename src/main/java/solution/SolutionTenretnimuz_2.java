package solution;

/*
문제제에에목
https://programmers.co.kr/learn/courses/30/lessons/xxxxx
참고링크 :
 */

import java.util.ArrayList;
import java.util.HashMap;

public class SolutionTenretnimuz_2 {
	public static void main(String[] args) {

		try {
			SolutionTenretnimuz_2 _s = new SolutionTenretnimuz_2();
			System.out.println(_s.solution(new int[][]{{1,0,5},{2,2,2},{3,3,1},{4,4,1},{5,10,2}}));//[1,3,4,2,5]
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			SolutionTenretnimuz_2 _s = new SolutionTenretnimuz_2();
			System.out.println(_s.solution(new int[][]{{1,0,3},{2,1,3},{3,3,2},{4,9,1},{5,10,2}}));//[1,3,2,4,5]
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			SolutionTenretnimuz_2 _s = new SolutionTenretnimuz_2();
			System.out.println(_s.solution(new int[][]{{1,2,10},{2,5,8},{3,6,9},{4,20,6},{5,25,5}}));//[1,2,4,5,3]
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int[] solution(int [][]n) {
		ArrayList<Integer> answerTemp = new ArrayList();
		int completeCnt = 0;

		ArrayList<int[]> queue = new ArrayList<>();
		int[] nowPrint = new int[] {-1,-1,-1};
		int second = 0;
		while(completeCnt < n.length){
			System.out.println("시작");

			//[시작] 해당 시간이 되면 큐에 넣음
			for (int i = 0; i < n.length; i++) {
				if (n[i][1] == second) {
					int[] temp = new int[]{n[i][0],n[i][1],n[i][2]};
					queue.add(temp);
				}
			}
			//[종료] 해당 시간이 되면 큐에 넣음

			//[시작] 현재 인쇄중인 것이 없고, 큐의 대기열이 있으면, 인쇄하도록 함
			if( nowPrint[0] == -1 && !queue.isEmpty()){
				nowPrint = this.poll(queue);
				answerTemp.add(nowPrint[0]);
			}
			//[종료] 현재 인쇄중인 것이 없고, 큐의 대기열이 있으면, 인쇄하도록 함

			//[시작] 현재 인쇄중인 문서를 1장 감소시킴
			if( nowPrint[0] != -1 ) {
				nowPrint[2] = nowPrint[2] - 1;
			}
			//[시작] 현재 인쇄중인 문서를 1장 감소시킴

			//[시작] 인쇄 완료 후 처리
			if( nowPrint[2] == 0 ){
				nowPrint[0] = -1;
				nowPrint[1] = -1;
				nowPrint[2] = -1;
				completeCnt++;
			}
			//[시작] 인쇄 완료 후 처리
			second++;
		}

		int[] answer = answerTemp.stream().mapToInt(Integer::intValue).toArray();

		return answer;
	}

	private int[] poll(ArrayList<int[]> queue) {
		int[] answer = {0,0,0};
		int min = 100001;
		int idx = 0;
		for(int i=0;i<queue.size();i++){
			if( queue.get(i)[2] < min ){
				answer[0] = queue.get(i)[0];
				answer[1] = queue.get(i)[1];
				answer[2] = queue.get(i)[2];
				min = queue.get(i)[2];
				idx = i;
			}
		}
		queue.remove(idx);

		return answer;
	}
}
