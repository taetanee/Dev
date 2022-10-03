package solution;

import java.util.*;

public class SolutionDM202210_1 {

    //문자열 길이 3~6
    //숫자 길이 0~6 ( null 가능, "0"은 안됨, 즉 "000"은 안됨 )

    public static void main(String[] args) {
        //DevMatching2022_02_1 s1 = new DevMatching2022_02_1();
        //s1.solution(new String[]{"card", "ace13", "ace16","banker","ace17","ace14"}, "ace15");

        //DevMatching2022_02_1 s2 = new DevMatching2022_02_1();
        //s2.solution(new String[]{"cow", "cow1", "cow2", "cow3", "cow4", "cow9", "cow8", "cow7", "cow6", "cow5"}, "cow");

        SolutionDM202210_1 s3 = new SolutionDM202210_1();
        s3.solution(new String[]{"bird99", "bird98", "bird101","gotoxy"}, "bird98");

        //DevMatching2022_02_1 s4 = new DevMatching2022_02_1();
        //s4.solution(new String[]{"card", "ace13", "ace16","banker","ace17","ace14"}, "ace15");

    }


    public String solution(String[] registered_list, String new_id) {
        String answer = "";

        //[시작] S추출
        int idx = new_id.length();
        for(int i=0;i<new_id.length();i++){
            String str = String.valueOf(new_id.charAt(i));
            if (isNumeric(str)) {
                idx = i;
                break;
            }
        }
        String S = new_id.substring(0,idx);
        //[종료] S추출


        //[시작] 중복 체크( 중복값 없으면, 입력한 값 그대로 추천 )
        boolean existFlag = false;
        for(int i=0;i<registered_list.length;i++){
            if(new_id.equals(registered_list[i])){
                existFlag = true;
            }
        }

        if(existFlag == false){
            return new_id;
        }
        //[종료] 중복 체크( 중복값 없으면, 입력한 값 그대로 추천 )


        //[시작] N값 찾기
        Set<Integer> set = new HashSet();
        for(int i=0;i<registered_list.length;i++){
            if(S.equals(registered_list[i].substring(0,idx))){
                set.add(Integer.parseInt(registered_list[i].substring(idx)));
            }
        }
        int N = Integer.parseInt(new_id.substring(idx));
        for(int i=0;i<registered_list.length;i++){
            for(Integer value : set) {
                if( isNumeric(registered_list[i].substring(idx)) == false){
                    continue;
                }

                if(value == Integer.parseInt(registered_list[i].substring(idx))){
                    N = value + 1;
                }

            }
        }
        //[종료] N값 찾기
        answer = S + N;

        return answer;
    }


    public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
