package solution;

import java.util.HashMap;

public class SolutionyTilibomoakak_1 {

	public static void main(String[] args) {
		SolutionyTilibomoakak_1 s1 = new SolutionyTilibomoakak_1();
		System.out.println(s1.solution("John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker", "Example"));
		//John Doe <jdoe@example.com>, Peter Parker <pparker@example.com>, Mary Jane Watson-Parker <mjwatsonpa@example.com>, James Doe <jdoe2@example.com>, John Elvis Doe <jedoe@example.com>, Jane Doe <jdoe3@example.com>, Penny Parker <pparker2@example.com>
		//John Doe <jdoe@example.com>, Peter Parker <pparker@example.com>, Mary Jane Watson-Parker <mjwatsonpa@example.com>, James Doe <jdoe2@example.com>, John Elvis Doe <jedoe@example.com>, Jane Doe <jdoe3@example.com>, Penny Parker <pparker2@example.com>

		//s1.replaceId("Mary Jane Watson-Parker");
	}


	public String solution(String S, String C) {
		String answer = "";

		String[] userArr = S.split(", ");

		HashMap<String,Integer> dupleId = new HashMap();
		for(int i=0;i<userArr.length;i++){
			String userName = userArr[i];

			//[0] name 추가
			answer += userName;
			//[0] name 추가

			//[0] < 추가
			answer += " <";
			//[0] < 추가

			//[1] ID 변환
			String id = replaceId(userName);
			answer += id;
			//[1] ID 변환

			//[2] 동일 ID number 추가
			if( dupleId.get(id) == null ){
				dupleId.put(id, 0);
			} else {
				dupleId.put(id, dupleId.get(id) + 1);
			}
			if( dupleId.get(id) == 0 ){

			} else {
				answer += dupleId.get(id)+1;
			}
			//[2] 동일 ID number 추가

			//[3] @example.com 추가
			answer += "@" + C.toLowerCase() + ".com";
			//[3] @example.com 추가

			//[0] > 추가
			answer += ">";
			//[0] > 추가

			//[4] , 추가
			if( i == userArr.length - 1){

			} else {
				answer += ", ";
			}
			//[4] , 추가
		}

		return answer;
	}

	public String replaceId(String userName){
		String result = "";
		String[] userNameSplitArray = userName.split(" ");
		for(int i=0;i<userNameSplitArray.length;i++){
			String userNameSplit = userNameSplitArray[i];
			if ( userNameSplit.contains("-") ){
				String[] lastNameSplitArray = userNameSplit.split("-");
				result += lastNameSplitArray[0].toLowerCase();
				for(int j=1;j<lastNameSplitArray.length;j++){
					String lastNameSplit = lastNameSplitArray[j];
					result += lastNameSplit.substring(0,2).toLowerCase();
				}
			} else {
				if( i == userNameSplitArray.length - 1){
					result += userNameSplit.toLowerCase();
				} else {
					result += Character.toLowerCase(userNameSplit.charAt(0));
				}
			}
		}
		return result;
	}
}
