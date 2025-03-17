class Solution {
    public long solution(int balls, int share) {
        int answer = 1;
        long result = 1;
        long a = 1;
        long b = 1;
        long c = 1;
        
        
        if(balls == share) {
        	result = 1;
        } else {
        	
        	for(int i = 1; i <= balls - share; i++) {
        		
        		result = result * (balls + 1 - i) /i;
        		
        		
        	}
        	
        	
        }
        
        return result;
    }
}