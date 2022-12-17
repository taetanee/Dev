package solution;

/*
부족한 금액 계산하기
https://school.programmers.co.kr/learn/courses/30/lessons/82612?language=java
 */

public class Solution82612 {
	public static void main(String[] args) {

		try {
			Solution82612 s1 = new Solution82612();
			System.out.println(s1.solution(3,20,4));//10
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public long solution(int price, int money, int count) {
		long answer = -1;
		long temp = 0;

		for(int i=1;i<=count;i++){
			temp = temp + ( price * i ) ;
		}
		answer = temp - money;

		if( answer < 0 ){
			return 0;
		} else {
			return answer;
		}
	}
}
