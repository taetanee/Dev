package solution;

public class SolutionGnapuoc_1_3 {
    public static void main(String[] args) {
        SolutionGnapuoc_1_3 s1 = new SolutionGnapuoc_1_3();
        s1.solution(new int[] {1,2,3,4,5,6});
        System.out.println("끝");
        //s1.solution(new int[] {1,2,3});
    }

    public int[] solution(int[] arr) {

        if( arr.length == 1){
            return arr;
        }

        int[] reverseArr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = arr[i];
        }

        if( reverseArr.length % 2 == 0){
            int[] temp1 = new int [reverseArr.length / 2];
            int[] temp2 = new int [reverseArr.length / 2];
            for(int i=0; i<reverseArr.length;i++) {
                if( i < reverseArr.length / 2){
                    temp1[i] = reverseArr[i];
                } else {
                    temp2[i-temp1.length] = reverseArr[i];
                }
            }
            int[] answer = merge(solution(temp1),solution(temp2));
            return answer;
        } else {
            int[] temp1 = new int [reverseArr.length / 2 + 1];
            int[] temp2 = new int [reverseArr.length / 2];
            for(int i=0; i<reverseArr.length;i++) {
                if( i <= reverseArr.length / 2){
                    temp1[i] = reverseArr[i];
                } else {
                    temp2[i-temp1.length] = reverseArr[i];
                }
            }
            int[] answer = merge(solution(temp1),solution(temp2));
            return answer;
        }
    }

    public int[] merge(int[] firstArray, int[] secondArray) {
        int length = firstArray.length + secondArray.length;
        int[] mergedArray = new int[length];
        int pos = 0;
        for (int element : firstArray) {
            mergedArray[pos] = element;
            pos++;
        }
        for (int element : secondArray) {
            mergedArray[pos] = element;
            pos++;
        }
        return mergedArray;
    }
}