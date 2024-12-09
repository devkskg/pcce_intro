package day02;

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
    }
}
