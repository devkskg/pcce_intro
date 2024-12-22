package day11;

public class Solution04 {
	public static void main(String[] args) {
		int n = 3628800;
		int answer = 0;
		long pac = 1;
		
			for(int j = 1; j <= n; j++) {
				pac *= j;
				if(pac <= n) {
					answer = j;
				} else {
					break;
				}
			}
		
		System.out.println(answer);
		
	}
}
