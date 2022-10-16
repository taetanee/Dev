package dev;

import java.util.Collections;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class DevPriorityQueue {
	public static void main(String[] args) {

		//[시작] Priority Queue 기본 사용
		PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>(); //낮은 숫자가 우선 순위인 int 형 우선순위 큐 선언
		PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());//높은 숫자가 우선 순위인 int 형 우선순위 큐 선언

		priorityQueueLowest.add(1); //add : 요소 추가 (성공시 : true, 실패시 : exception)
		priorityQueueLowest.offer(2); //offer : 요소 추가 (성공시 : true, 실패시 : false)

		priorityQueueLowest.remove(); //remove : 우선순위 높은 요소 반환 및 삭제 (성공시 : 값반환, 없을시 : exception)
		priorityQueueLowest.poll(); //poll : 우선순위 높은 요소 반환 및 삭제 (성공시 : 값반환, 없을시 : false)

		priorityQueueLowest.add(1);
		priorityQueueLowest.element(); // element : 우선순위 높은 값 반환 (성공시 : 값반환, 없을시 : exception)
		priorityQueueLowest.peek(); // peek : 우선순위 높은 값 반환 (성공시 : 값반환, 없을시 : false)
		//[종료] Priority Queue 기본 사용


		//[시작] 개념과 동작( https://crazykim2.tistory.com/575 )
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(1);
		pq.add(15);
		pq.add(21);
		pq.add(25);
		pq.add(8);
		//[종료] 개념과 동작( https://crazykim2.tistory.com/575 )

		//[시작] String에서도 알파벳 순으로 됨
		PriorityQueue<String> pqs = new PriorityQueue<>();
		pqs.add("aa");
		pqs.add("oo");
		pqs.offer("jj");
		pqs.add("uu");
		pqs.add("yy");
		pqs.offer("rr");
		pqs.add("hh");
		//[종료] String에서도 알파벳 순으로 됨


		//[시작] HashMap은 PriorityQueue 자료형에서 사용할 수 없음
		PriorityQueue<HashMap<Integer, Integer>> pqh = new PriorityQueue<>();
		HashMap<Integer, Integer> temp1 = new HashMap();
		temp1.put(1, 1);
		pqh.add(temp1);
		HashMap<Integer, Integer> temp2 = new HashMap();
		temp2.put(15, 15);
		try {
			pqh.add(temp2);
		} catch (ClassCastException e) {
			System.out.println("ClassCastException > error (PriorityQueue은 변환할 수 없음)");
		} catch (Exception e) {
			System.out.println("Exception > error");
		}
		//[종료] HashMap은 PriorityQueue 자료형에서 사용할 수 없음


		// [시작] add와 offer 차이 ( https://goodteacher.tistory.com/112 )
		PriorityQueue<Integer> pq2 = new PriorityQueue<>();
		pq2.add(1);
		pq2.poll(); //1 반환
		pq2.poll(); //null반환(에러 발생 안함)

		PriorityQueue<Integer> pq3 = new PriorityQueue<>();
		pq3.add(1);
		pq3.remove();   //1 반환
		try {
			pq3.remove();   //예외 발생
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException > error");
		} catch (Exception e) {
			System.out.println("Exception > error");
		}
		// [종료] add와 offer 차이 ( https://goodteacher.tistory.com/112 )

		System.out.println("끝");
	}
}
