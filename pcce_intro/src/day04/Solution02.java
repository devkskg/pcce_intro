package day04;

public class Solution02 {
	public int solution(int n) {
        int answer = 1;
        
        
        while(true) {
        	if(6 * answer % n == 0) {
        		break;
        	} else {
        		answer++;
        	}
        }
//        6조각의 피자
//        나눠먹을 사람 수 n
//        모두 같은 수의 피자 조각 먹어야댐
//        
        
        
        
        
        return answer;
    }
}
