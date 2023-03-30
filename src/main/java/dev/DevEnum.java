package dev;



public class DevEnum {

	enum Season {
		봄, 여름, 가을, 겨울
	}

	public static void main(String[] args) {
		Season seson = Season.여름;
		System.out.println(seson.ordinal());
	}
}