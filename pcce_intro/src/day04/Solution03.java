package day04;

public class Solution03 {
	public int solution(int slice, int n) {
        int answer = 1;
        int k = 0;
//        int[] p = new int[10];
        
//        피자는 2~10조각 마음대로
//        (2~10) answer < for반복
//        n명의 사람이 최소 한조각 이상 먹으려면
//        (2~10)*answer / n >=1 일때 answer
//        피자 몇 판 필요?
        while(k == 0) {
        		if((slice * answer) / n >=1) {
        			k++;
        		} else {
        			answer++;
        		}
        	
        }
        
        
        
        
        return answer;
    }
}
