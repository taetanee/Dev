package solution;

/*
나누어 떨어지는 숫자 배열
https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */

import java.util.ArrayList;
import java.util.Collections;

public class Solution12910 {
	public static void main(String[] args) {
		Solution12910 s1 = new Solution12910();
		System.out.println(s1.solution(new int[]{5, 9, 7, 10}, 5));//5,10

		Solution12910 s2 = new Solution12910();
		System.out.println(s2.solution(new int[]{2, 36, 1, 3}, 1));//1,2,3,36

		Solution12910 s3 = new Solution12910();
		System.out.println(s3.solution(new int[]{3, 2, 6}, 10));//-1
	}

	public int[] solution(int[] arr, int divisor) {
	    //[시작] set arrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				arrayList.add(arr[i]);
			}
		}
        //[종료] set arrayList

		//[시작] sort arrayList
        Collections.sort(arrayList);
		//[종료] sort arrayList

		//[시작] return no data
		if( arrayList.size() == 0 ){
            return new int[]{-1};
        }
		//[종료] return no data

        //[시작] set answer
		int[] answer = new int[arrayList.size()];
		int idx = 0;
		for( int val : arrayList ){
			answer[idx] = val;
			idx++;
        }
        //[종료] set answer

		return answer;
	}
}
