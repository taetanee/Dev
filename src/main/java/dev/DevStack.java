package dev;

import java.util.Stack;

public class DevStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();//int형 스택 선언
		stack.push(1);  //push : 값 추가
		stack.size();        //size : 사이즈 출력
		stack.peek();        //peek : 상단값 반환
		stack.pop();         //pop : 상단값 반환하면서 제거
		stack.empty();       //empty : 비어있는지 체크 (비어있으면 true, 비어있지 않으면 false)
		stack.contains(2);   //contains : 비어있는지 체크 (비어있으면 true, 비어있지 않으면 false)
		stack.clear();       //clear : 전체값 제거
	}
}