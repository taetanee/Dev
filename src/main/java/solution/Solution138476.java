package solution;

/*
귤 고르기
https://school.programmers.co.kr/learn/courses/30/lessons/138476
참고링크 :
 */

import java.util.*;

public class Solution138476 {
	public static void main(String[] args) {
		try {
			Solution138476 _s = new Solution138476();
			System.out.println(_s.solution(6,new int[]{1, 3, 2, 5, 4, 5, 2, 3}));//3
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution138476 _s = new Solution138476();
			System.out.println(_s.solution(4, new int[] {1, 3, 2, 5, 4, 5, 2, 3}));//2
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution138476 _s = new Solution138476();
			System.out.println(_s.solution(2, new int[] {1, 1, 1, 1, 2, 2, 2, 3}));//1
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int solution(int k, int[] tangerine) {
		int answer = 0;
		int currentBucketAppleCnt = 0;

		HashMap<String, Integer> hashMap = new HashMap();
		for(int i=0;i<tangerine.length;i++){
			String key = String.valueOf(tangerine[i]);
			if( hashMap.get(key) == null){
				hashMap.put(key, 1);
			} else {
				hashMap.put(key, hashMap.get(key) + 1);
			}
		}

		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(hashMap.entrySet());
		entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}
		});


		for(Map.Entry<String, Integer> entry : entryList){
			if( k == currentBucketAppleCnt ){
				//사과가 딱 꽉찬 경우 => 연산 그만함
				break;
			} else if(  k > currentBucketAppleCnt + entry.getValue() ){
				//사과에 새 종류를 넣어도 넘치는 경우 => 사과에 새 종류를 넣고 연산 계속함
				currentBucketAppleCnt += entry.getValue();
				answer++;
			} else if( k > currentBucketAppleCnt ){
				//사과에 새 종류를 넣지만 새 종류를 모두 넣지 못하는 경우 => 연산 그만함
				answer++;
				break;
			} else {
				break;
			}
		}

		return answer;
	}
}
