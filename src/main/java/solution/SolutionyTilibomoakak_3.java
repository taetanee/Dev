package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SolutionyTilibomoakak_3 {

	public static void main(String[] args) {
		SolutionyTilibomoakak_3 s1 = new SolutionyTilibomoakak_3();
		s1.solution(new int[]{3, 2, 3, 2, 3}); //5

		SolutionyTilibomoakak_3 s2 = new SolutionyTilibomoakak_3();
		s2.solution(new int[]{7, 4, -2, 4, -2, -9}); //4

		SolutionyTilibomoakak_3 s3 = new SolutionyTilibomoakak_3();
		s3.solution(new int[]{7, 4, -2, 4, -2, -9}); //4

		SolutionyTilibomoakak_3 s4 = new SolutionyTilibomoakak_3();
		s4.solution(new int[]{1}); //1

	}

	public int solution(int[] A) {
		int answer = 0;
		for(int i=1;i<=A.length;i++){
			for(int j=0;j<=A.length-i;j++){
				int tempAnswer = getSwitchingCnt(Arrays.copyOfRange(A, j, i+j));
				if( tempAnswer > answer){
					answer = tempAnswer;
				}

			}
		}
		return answer;
	}

	public int getSwitchingCnt(int[] A){
		int answer = 0;

		Queue<Integer> oddQueue = new LinkedList();
		Queue<Integer> evenQueue = new LinkedList();

		for (int i = 0; i < A.length; i++) {
			if (i % 2 == 0) {
				//홀수번째
				if (oddQueue.size() == 0) {
					oddQueue.add(A[i]);
					answer++;
				} else {
					if( oddQueue.poll() == A[i] ){
						oddQueue.add(A[i]);
						answer++;
					} else {
						return answer;
					}
				}
			} else {
				//짝수번째
				if (evenQueue.size() == 0) {
					evenQueue.add(A[i]);
					answer++;
				} else {
					if( evenQueue.poll() == A[i] ){
						evenQueue.add(A[i]);
						answer++;
					} else {
						return answer;
					}
				}
			}
		}

		return answer;
	}
}
