package day01;

public class Solution07 {
	public int[] solution(int numer1, 
			int denom1, int numer2, int denom2) {
		

        int y = 1;
		int numer = (numer1 * denom2 + numer2 * denom1);
		int denom = denom1 * denom2;
	
		for(int i = 2; i <= denom && i <= numer; i++) {
			if(denom % i == 0 && numer % i == 0) {
				y = i;
			}
		}
		
		numer = numer / y;
		denom = denom / y;
			
		
		
		int[] answer = {numer, denom};
        return answer;
    
//		
//		int[] denom1Arr = {1};
//		int[] newDenom1Arr;
//		int y = 0;
//		int sum1 = 0;
//		int sum2 = 0;
//		
//		for(int i = 1; i <= denom1; i++) {
//			for(int j = 2; j <= denom1; j++) {
//				if(denom1 % j == 0) {
//					int newDenom1ArrLength = denom1Arr.length + 1;
//					newDenom1Arr = new int[newDenom1ArrLength];
//					newDenom1Arr[i] = j;
//					break;
//				}
//			}
//		}
//		for(int i = 1; i <= newDenom1Arr.length; i++) {
//			System.out.println();
//		}
//		
//		int[] answer = {sum1, sum2};
//        return answer;
    }
}
