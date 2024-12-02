package day01;

public class Solution07 {
	public int[] solution(int numer1, 
			int denom1, int numer2, int denom2) {
		
		int[] denom1Arr = {1};
		int[] newDenom1Arr;
		int y = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1; i <= denom1; i++) {
			for(int j = 2; j <= denom1; j++) {
				if(denom1 % j == 0) {
					int newDenom1ArrLength = denom1Arr.length + 1;
					newDenom1Arr = new int[newDenom1ArrLength];
					newDenom1Arr[i] = j;
					break;
				}
			}
		}
		for(int i = 1; i <= newDenom1Arr.length; i++) {
			System.out.println();
		}
		
		int[] answer = {sum1, sum2};
        return answer;
    }
}
