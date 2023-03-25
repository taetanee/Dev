package solution;

/*
연속 부분 수열 합의 개수
https://school.programmers.co.kr/learn/courses/30/lessons/131701
참고링크 :
 */
import java.util.Arrays;
import java.util.HashSet;

public class Solution131701 {
	public static void main(String[] args) {

		try {
			Solution131701 _s = new Solution131701();
			System.out.println(_s.solution(new int[]{7,9,1,1,4}));//18
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int solution(int[] elements) {
		int answer = 0;

		HashSet<Integer> hashSet = new HashSet();

		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				int temp[] = new int[i+1];
				int firstIdx = j;
				int lastIdx = j + i + 1;

				if (lastIdx <= elements.length) {
					temp = Arrays.copyOfRange(elements, firstIdx, lastIdx);
				} else {
					int idx = 0;
					while( idx < temp.length){
						temp[idx] = elements[(firstIdx + idx) % elements.length];
						idx++;
					}
				}

				int sum = 0;
				for(int z=0;z<temp.length;z++){
					sum += temp[z];
				}
				hashSet.add(sum);
			}
		}
		answer = hashSet.size();
		return answer;
	}
}
