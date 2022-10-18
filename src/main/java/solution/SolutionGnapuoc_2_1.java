package solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SolutionGnapuoc_2_1 {
    public static void main(String[] args) {

        SolutionGnapuoc_2_1 s1 = new SolutionGnapuoc_2_1();
        System.out.println(s1.solution(new int[]{5, 3, 9, 13}, 8)); // true
        System.out.println(s1.solution(new int[]{5, 3, 9, 13}, 7)); // false

        int[] arr = new int[500000];
        for(int i=0;i<500000;i++) {
            arr[i] = i+1;
        }
        System.out.println(s1.solution(arr,999999)); //true
        System.out.println(s1.solution(arr,1000001)); //false
    }

    public boolean solution(int[] arr, int n) {
        HashMap<Integer,Boolean> hashMap = new HashMap();
        for(int i=0;i<arr.length;i++){
            hashMap.put(arr[i], true);
        }
        for(Integer x : hashMap.keySet()){
            if( hashMap.get(n-x) != null){
                return true;
            }
        }
        return false;
    }

//    public boolean solution2(int[] arr, int n) {
//        boolean answer = false;
//
//        int length = arr.length;
//
//        for (int i = 0; i < length; i++) {
//
//            if (arr[i] > n) {
//                continue;
//            }
//
//            for (int j = i + 1; j < length; j++) {
//                if (arr[j] > n) {
//                    continue;
//                }
//
//                if (arr[i] + arr[j] == n) {
//                    answer = true;
//                    return answer;
//                }
//            }
//        }
//
//        return answer;
//    }
}
