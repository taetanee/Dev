package solution;

/*
정수 제곱근 판별
https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */

public class Solution12934 {
    public static void main(String[] args) {
        Solution12934 s1 = new Solution12934();
        System.out.println(s1.solution(121));//144

        Solution12934 s2 = new Solution12934();
        System.out.println(s2.solution(3));//-1
    }

    public long solution(long n) {
        long answer = 0;
        double tempN = Math.sqrt(n);
        if (Math.ceil(tempN) * Math.ceil(tempN) != n) {
            return -1;
        }
        answer = (long) Math.pow(tempN + 1, 2);
        return answer;
    }
}
