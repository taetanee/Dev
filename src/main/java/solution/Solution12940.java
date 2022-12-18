package solution;

/*
최대공약수와 최소공배수
https://school.programmers.co.kr/learn/courses/30/lessons/12940
 */

public class Solution12940 {
	public static void main(String[] args) {

		try {
			Solution12940 s1 = new Solution12940();
			System.out.println(s1.solution(3, 12));//[3,12]
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			Solution12940 s2 = new Solution12940();
			System.out.println(s2.solution(2,5));//[1,10]
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[0] = gdc(n,m);
		answer[1] = lcm(n,m);
		return answer;
	}

	static int gdc(int a, int b) { //최대 공약수
		if(a<b) // 유클리드 호제법 조건
		{
			int temp = a;
			a = b;
			b = temp;
		}
		while(b!=0) { // 유클리드 호제법
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}

	static int lcm(int a, int b) { //최소 공배수
		return a*b / gdc(a,b);
	}
}
