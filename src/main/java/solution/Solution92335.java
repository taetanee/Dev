package solution;

/*
k진수에서 소수 개수 구하기
https://school.programmers.co.kr/learn/courses/30/lessons/92335
참고링크 :
 */

public class Solution92335 {
	public static void main(String[] args) {

		try {
			Solution92335 _s = new Solution92335();
			System.out.println(_s.solution(437674, 3));
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution92335 _s = new Solution92335();
			System.out.println(_s.solution(110011, 10));
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	public int solution(int n, int k) {
		int answer = 0;

		String s = Integer.toString(n, k);
		String[] temp = s.split("0");

		for(int i=0;i<temp.length;i++){
			String str = temp[i];
			if("".equals(str)){
				continue;
			}
			long lo = Long.parseLong(str);
			if( isPrime(lo) ){
				answer++;
			}
		}
		return answer;
	}

	public boolean isPrime(long n) {
		if(n == 1){
			return false;
		}

		for (int i = 2; i<=(long)Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
