package day03;

public class Solution04 {
	public int[] solution(int n) {
		
		int endIndex = 1;
        
        if(n == 1) {
        	endIndex = 0;
        } else if(n % 2 == 1){
        	endIndex = n / 2 ;
        } else {
        	endIndex = n / 2 - 1;
        }
        
        
        int[] answer = new int[endIndex + 1];
        
        for(int i = 0; i <= endIndex; i++) {
        	answer[i] = 2 * i + 1;
        }
        
        
        
        return answer;
    }
}
