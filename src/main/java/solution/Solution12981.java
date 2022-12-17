package solution;

/*
영어 끝말잇기
https://school.programmers.co.kr/learn/courses/30/lessons/12981
 */

import java.util.LinkedList;

public class Solution12981 {
	public static void main(String[] args) {

		try {
			Solution12981 s1 = new Solution12981();
			System.out.println(s1.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));
			//[3,3]
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution12981 s2 = new Solution12981();
			System.out.println(s2.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}));
			//[0,0]
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution12981 s3 = new Solution12981();
			System.out.println(s3.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"}));
			//[1,3]
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int[] solution(int n, String[] words) {
		int[] answer = {0,0};
		LinkedList<String> linkedList = new LinkedList<String>();
		boolean flag = false;

		for(int i=0;i<words.length;i++){
			String word = words[i];
			if( linkedList.isEmpty() ){
				linkedList.add(word);
			} else if(isDuplication(linkedList, word) == true){
				linkedList.add(word);
				flag = true;
				break;
			} else if(words[i-1].charAt(words[i-1].length() - 1) == words[i].charAt(0)){
				linkedList.add(word);
			} else if(words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0)){
				linkedList.add(word);
				flag = true;
				break;
			} else {
				System.out.println("예기치 않은 오류 발생");
			}
		}

		if( flag == false ) {
			answer[0] = 0;
			answer[1] = 0;
		} else {
			answer[0] = linkedList.size() % n == 0 ? n : linkedList.size() % n;
			answer[1] = ( linkedList.size() - 1) / n + 1 ;
		}

		return answer;
	}

	boolean isDuplication(LinkedList<String> linkedList, String word){
		for(int i=0;i<linkedList.size();i++){
			if( word.equals(linkedList.get(i)) ){
				return true;
			}
		}
		return false;
	}
}