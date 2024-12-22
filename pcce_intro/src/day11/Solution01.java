package day11;

public class Solution01 {
	public static void main(String[] args) {
//		int[] box = {1, 1, 1};
		int[] box = {10, 8, 6};
		
//		int n = 1;
		int n = 3;
		
		int inner = 1;
		
		for(int i = 0; i < box.length; i++) {
			inner *= box[i] / n;
		}
		
		System.out.println(inner);
		
		
	}
}
