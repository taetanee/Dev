package solution;

import java.util.*;

public class SolutionGnapuoc_2_3 {

	public static void main(String[] args) {
		SolutionGnapuoc_2_3 s1 = new SolutionGnapuoc_2_3();
		//System.out.println(s1.solution(new String[]{"DS7651 A0", "CA0055 D+", "AI5543 C0", "OS1808 B-", "DS7651 B+", "AI0001 F", "DB0001 B-", "AI5543 D+", "DS7651 A+", "OS1808 B-"}));
		System.out.println(s1.solution(new String[]{"AAA A-", "BBB A+", "BBB A+", "AAA A+"}));
	}

	public String[] solution(String[] grades) {

		HashMap<String, String> point = new HashMap();
		for (int i = 0; i < grades.length; i++) {
			String[] tempArr = grades[i].split(" ");
			if (point.get(tempArr[0]) == null) {
				point.put(tempArr[0], tempArr[1]);
			} else if (getIndexByGrade(tempArr[1]) < getIndexByGrade(point.get(tempArr[0]))) {
				point.put(tempArr[0], tempArr[1]);
			} else {
				//no action
			}
		}

		String[] answer = new String[point.size()];
		List<Map.Entry<String, String>> entryList = new LinkedList<>(point.entrySet());
		entryList.sort(Map.Entry.comparingByValue());
		int i = 0;
		for (Map.Entry<String, String> entry : entryList) {
			answer[i] = entry.getKey() + " " + entry.getValue();
			i++;
		}

		return answer;
	}

	public int getIndexByGrade(String p) {
		int result = -1;
		String[] point = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
		for (int i = 0; i < point.length; i++) {
			if (p.equals(point[i])) {
				result = i;
				return result;
			}
		}

		return result;
	}
}
