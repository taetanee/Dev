package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SolutionEcalptekcub_2 {
	public static void main(String[] args) {
		SolutionEcalptekcub_2 s1 = new SolutionEcalptekcub_2();
		System.out.println(s1.solution(6,2,4)); //5

		//SolutionEcalptekcub_2 s2 = new SolutionEcalptekcub_2();
		//System.out.println(s2.solution(4,1,3)); //6
	}

	public int solution(int n, int delay, int forget) {
		int answer = 0;
		ArrayList<Integer[][]> personList = new ArrayList<>(); //delay, forget
		Integer[][] temp = new Integer[1][2];
		temp[0][0] = delay;
		temp[0][1] = forget;
		personList.add(temp);

//		for(int i=1;i<=n;i++){
//
//		}

		return answer;
	}
}
