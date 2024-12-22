package day11;

public class Solution02 {
	public static void main(String[] args) {
		
		int n = 10;
		int count = 0;
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				if(i % j ==0) {
					count++;
				}
			}
			if(count >= 3) {
				answer++;
			}
			count = 0;
		}
		
		System.out.println(answer);
		
		
		
	}
}
