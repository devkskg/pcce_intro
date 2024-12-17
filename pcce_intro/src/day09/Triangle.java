package day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Triangle {
	public int tri(int[] sides) {
		
		int answer = 2;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int s : sides) {
			list.add(s);
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		if(list.get(2) < list.get(0) + list.get(1)){
			answer = 1;
		}
		
		
		
		
		return answer;
	}
}
