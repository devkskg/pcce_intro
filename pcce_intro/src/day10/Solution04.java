package day10;

import java.util.ArrayList;
import java.util.List;

public class Solution04 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };
//		String direction = "right";
		String direction = "left";
		List<Integer> list = new ArrayList<Integer>();
		for (int n : numbers) {
			list.add(n);
		}
		List<Integer> list2 = new ArrayList<Integer>(list);
		int first = list.get(0);

		int last = list.get(list.size() - 1);

		if (direction.equals("right")) {
			for (int i = 1; i < list.size(); i++) {

				list.set(i, list2.get(i - 1));

				list.set(0, last);
			}
//			list.set(0, last);
//			list.set(list.size()-1, first);
		} else if (direction.equals("left")) {
//			list.set(0, null)
			for (int i = list.size() - 2 ; i >= 0; i--) {

				list.set(i, list2.get(i + 1));

				list.set(list.size()-1, first);
			}
		}
		
		System.out.println(list);

	}
}
