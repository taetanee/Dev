package solution;

/*
문제제에에목
https://programmers.co.kr/learn/courses/30/lessons/xxxxx
 */

public class Solutionmbuhtib {
	public static void main(String[] args) {

		try {
			Solutionmbuhtib _s = new Solutionmbuhtib();
			for(int i=100000000;i>99900000;i--){
				System.out.println("==========");
				System.out.println(_s.solution(i));
				System.out.println("==========");
			}
		} catch (Exception e){
			e.printStackTrace();
		}


	}

	public int solution(int n) {
		int box3 = 0;
		int box5 = -999;

		while( true ){

			if( n < box3 * 3){
				return -1;
			}

			box5 = (n - (3 * box3)) / 5;
			if ( box5 * 5 + box3 * 3 == n ) {
				break;
			}
			box3++;
		}

		//[시작] 검증
		int verification = (box5 * 5) + (box3 * 3);
		System.out.println( "( " + box5 + " * 5 ) + ( "+box3 + " * 3 " + ") = " + verification);
		if( verification != n ){
			System.out.println("검증실패!!!!!!!!!!!");
		}
		//[종료] 검증

		return box5 + box3;
	}
}
