package solution;

public class SolutionGnapuoc_1_1 {

    public static void main(String[] args) {
        SolutionGnapuoc_1_1 s1 = new SolutionGnapuoc_1_1();
        s1.solution(5, new int[] {1,2,3,4,5});

        SolutionGnapuoc_1_1 s2 = new SolutionGnapuoc_1_1();
        s2.solution(5, new int[] {3,5,4,1,2});
    }


    public int solution(int N, int[] sequence) {
        int answer = 0;
        int currentIndex = 1;

        int tempDirection = 0;
        int tempOppDirection = 0;
        for(int i=0;i<sequence.length;i++){
            if( currentIndex < sequence[i] ){
                tempDirection = Math.abs(sequence[i] - currentIndex);
                tempOppDirection = Math.abs(currentIndex + N - sequence[i]);
            } else {
                tempDirection = Math.abs(sequence[i] - currentIndex);
                tempOppDirection = Math.abs(N - currentIndex + sequence[i]);
            }

            if( tempDirection < tempOppDirection ){
                answer += tempDirection;
                currentIndex = sequence[i];
            } else {
                answer += tempOppDirection;
                currentIndex = sequence[i];
            }
        }

        return answer;
    }
}
