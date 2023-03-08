package solution;

/*
튜플
https://school.programmers.co.kr/learn/courses/30/lessons/64065
https://velog.io/@qwe916/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-64065-%ED%8A%9C%ED%94%8C : 참고해서 풀었음
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution64065 {
	public static void main(String[] args) {

		try {
			Solution64065 _s = new Solution64065();
			System.out.println(_s.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"));//[2, 1, 3, 4]
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution64065 _s = new Solution64065();
			System.out.println(_s.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"));//[2, 1, 3, 4]
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution64065 _s = new Solution64065();
			System.out.println(_s.solution("{{20,111},{111}}"));//[111, 20]
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution64065 _s = new Solution64065();
			System.out.println(_s.solution("{{123}}"));//[123]
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution64065 _s = new Solution64065();
			System.out.println(_s.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"));//[3, 2, 4, 1]
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int[] solution(String s) {

		Set<String> set = new HashSet<>();
		String [] sArray = s.replace("{{","").replace("}}","").split("\\}," + "\\{");

		Arrays.sort(sArray, (a, b) -> {return a.length() - b.length();});

		int[] answer = new int[sArray.length];

		int idx = 0 ;
		for(int i=0; i<sArray.length; i++){
		    String rawData = sArray[i];
		    String[] rawDataArray = rawData.split(",");
		    for(int j=0;j<rawDataArray.length;j++){
			if(set.add(rawDataArray[j])) {
			    answer[idx++] = Integer.parseInt(rawDataArray[j]);
			}
		    }
		}

		return answer;
    	}
}
