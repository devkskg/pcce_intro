package day11;

public class Solution03 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int answer = 0;
		
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j =i + 1; j < numbers.length; j++) {
				if(answer < numbers[i] * numbers[j]) {
					answer = numbers[i] * numbers[j];
				}
			}
		}
		
		System.out.println(answer);
	}
}
