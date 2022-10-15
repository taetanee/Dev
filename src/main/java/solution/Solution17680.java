package solution;

/*
[1차 캐시]
https://school.programmers.co.kr/learn/courses/30/lessons/17680
 */

import java.util.LinkedList;

public class Solution17680 {
	public static void main(String[] args) {

		Solution17680 s1 = new Solution17680();
		System.out.println(s1.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));//50
		Solution17680 s2 = new Solution17680();
		System.out.println(s2.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));//21
		Solution17680 s3 = new Solution17680();
		System.out.println(s3.solution(2, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));//60
		Solution17680 s4 = new Solution17680();
		System.out.println(s4.solution(5, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));//52
		Solution17680 s5 = new Solution17680();
		System.out.println(s5.solution(2, new String[] {"Jeju", "Pangyo", "NewYork", "newyork"}));//16
		Solution17680 s6 = new Solution17680();
		System.out.println(s6.solution(0, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));//25
		//Solution17680 s7 = new Solution17680();
		//System.out.println(s7.solution(2, new String[] {"A", "A", "A", "A", "A"}));//9
		//Solution17680 s8 = new Solution17680();
		//System.out.println(s8.solution(3, new String[] {"A", "B", "A"}));//11
		//Solution17680 s9 = new Solution17680();
		//System.out.println(s9.solution(4, new String[]{"1", "2", "3", "1", "4", "5"}));//11
	}

	public int solution(int cacheSize, String[] cities) {
		int answer = 0;

		LinkedList<String> cache = new LinkedList();
		for(int i=0;i<cities.length;i++){
			String city = cities[i].toLowerCase();
			if(cacheSize == 0){
				//캐시 사이즈가 0인 경우 => 무조건 개당 5씩 발생
				answer += 5;
			} else if( cache.indexOf(city) != -1){
				//캐시 적중 => 해당하는 도시 최신화
				cache.remove(cache.indexOf(city));
				cache.add(city);
				answer += 1;
			} else if( cache.size() == cacheSize && cache.indexOf(cities[i]) == -1){
				//캐시가 모두 찼으면서, 캐시가 적중되지 않은 경우 => 제일 마지막에 호출된 도시 삭제후, 현재 도시 캐시
				cache.remove(0);
				cache.add(city);
				answer += 5;
			} else {
				//그 외
				cache.add(city);
				answer += 5;
			}
		}

		return answer;
	}
}
