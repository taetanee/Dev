package dev;

import java.util.ArrayList;

public class DevArrayOfArrayList {

	public static void main(String[] args) {
		ArrayList<String[]> arrayList1 = new ArrayList<>();
		arrayList1.add(new String[2]);

		ArrayList<Integer[]> arrayList2 = new ArrayList<>();
		arrayList2.add(new Integer[2]);


		ArrayList<Integer[][]> arrayList3 = new ArrayList<>();

		Integer[][] temp = new Integer[1][2];
		temp[0][0] = 1;
		temp[0][1] = 2;
		arrayList3.add(temp);
	}
}
