package solution;

import java.util.ArrayList;

public class SolutionEnonioc_1 {


	public static void main(String[] args) {
		SolutionEnonioc_1 s1 = new SolutionEnonioc_1();
		System.out.println(s1.solution(new int[]{500, 1000, -300, 200, -400, 100, -100}));
	}

	public int[] solution(int[] deposit) {
		ArrayList<Integer> answerTemp = new ArrayList();

		int index = -1;
		for (int i = 0; i < deposit.length; i++) {
			if (i == 0 || deposit[i] > 0) {
				answerTemp.add(deposit[i]);
				index++;
			} else {
				if (answerTemp.get(index) > (deposit[i] * -1)) {
					answerTemp.set(index, answerTemp.get(index).intValue() - deposit[i] * -1);
				} else {
					int tempReminder = answerTemp.get(index).intValue() - deposit[i] * -1;
					while (!answerTemp.isEmpty()) {
						//tempReminder = answerTemp.get(index).intValue() - deposit[i] * -1;
						tempReminder = answerTemp.get(index).intValue() + tempReminder;
						if (tempReminder > 0) {
							answerTemp.set(index, answerTemp.get(index).intValue() - deposit[index] * -1);
							break;
						} else {
							answerTemp.remove(index);
							index--;
						}
					}
				}
			}
		}

		int[] answer = new int[answerTemp.size()];
		int size = 0;
		for (int temp : answerTemp) {
			answer[size++] = temp;
		}

		return answer;
	}
}
