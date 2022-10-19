package solution;

public class SolutionyTilibomoakak_1 {

	public static void main(String[] args) {
		SolutionyTilibomoakak_1 s1 = new SolutionyTilibomoakak_1();
		System.out.println(s1.solution("John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker", "Example"));
		//John Doe <jdoe@example.com>, Peter Parker <pparker@example.com>, Mary Jane Watson-Parker <mjwatsonpa@example.com>, James Doe <jdoe2@example.com>, John Elvis Doe <jedoe@example.com>, Jane Doe <jdoe3@example.com>, Penny Parker <pparker2@example.com>
	}


	public String solution(String S, String C) {
		String answer = "";
		String[] userNameArray = S.split(", ");
		for(int i=0;i<userNameArray.length;i++){
			String[] userName = userNameArray[i].split(" ");
			String lastName = userName[userName.length-1];
			String name = "";
			String tempAnswer = "";
			for(int j=0;j<userName.length-1;j++){
				name += userName[j].charAt(0);
			}
			tempAnswer += userNameArray[i];
			tempAnswer += " <";
			tempAnswer += myReplace(name,lastName);
			tempAnswer += "@";
			tempAnswer += C.toLowerCase();
			tempAnswer += ".com>";
			if( i != userNameArray.length -1 ){
				tempAnswer += ", ";
			}
			answer += tempAnswer;
		}
		return answer;
	}

	public String myReplace(String name, String lastName){
		String result = "";
		for(int i=0;i<name.length();i++){
			if( name.charAt(i) == '-'){

			} else if(Character.isDigit(name.charAt(i)) == false) {
				result += Character.toLowerCase(name.charAt(i));
			} else {
				result += name.charAt(i);
			}
		}

		int hipenIdx = -1;
		for(int i=0;i<lastName.length();i++){
			if(hipenIdx != -1 && hipenIdx + 2 < i){

			} else if( lastName.charAt(i) == '-' ){
				hipenIdx = i;
			} else if(Character.isDigit(lastName.charAt(i)) == false) {
				result += Character.toLowerCase(lastName.charAt(i));
			} else {
				result += lastName.charAt(i);
			}
		}
		return result;
	}
}
