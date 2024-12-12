package day06;

public class Solution03 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int countA = 0;
		int countB = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				countA++;
			} else {
				countB++;
			}
		}
		
		
		
		int[] answer = {countA , countB};
		
//        return answer;
	}
}
