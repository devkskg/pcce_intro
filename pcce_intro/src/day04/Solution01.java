package day04;

public class Solution01 {
	public int solution(int n) {
        int p = 1;
        while(true) {
        	if(7*p < n) {
        		p++;
        	} else {
        		break;
        	}
        	
        }
        
        return p;
    }
}



//        피자는 7조각, 피자의 갯수는 p
//        사람은 n

//        7*p / n < 1 -> p++ 
//        if 7*p / n <= 1 -> print p