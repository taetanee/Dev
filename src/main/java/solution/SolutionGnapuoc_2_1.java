package solution;

public class SolutionGnapuoc_2_1 {

    public static void main(String[] args) {
        SolutionGnapuoc_2_1 s1 = new SolutionGnapuoc_2_1();
        System.out.println(s1.solution(new int[]{5,3,9,13},8));
        //System.out.println(s1.solution(new int[]{5,3,9,13},7));
    }

    public boolean solution(int[] arr, int n) {
        boolean answer = false;

        int length = arr.length;

        for(int i=0;i<length;i++){

            if( arr[i] > n ){
                continue;
            }

            for(int j=i+1;j<length;j++) {
                if( arr[j] > n){
                    continue;
                }

                if( arr[i] + arr[j] == n){
                    answer = true;
                    return answer;
                }
            }
        }

        return answer;
    }
}
