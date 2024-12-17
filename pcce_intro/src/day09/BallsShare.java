package day09;

import java.math.BigInteger;

public class BallsShare {
	public long method(int balls, int share) {
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
        
        
        
//        else {
//        	for(int i = share+1; i <= balls; i++) {
//        		a *= i;
//        	}
//        	
//        	for(int i = 1; i <= balls - share; i++){
//        		c *= i;
//        	}
//        	
//        	result = a/c;
//        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        BigInteger aa = new BigInteger("1");
        
//        if(balls > share ){
//        	for(int i = 1; i <= balls; i++){
//        		a *= i;
//        		System.out.println(a);
//        	}
//        	
//        	for(int i = 1; i <= share; i++){
//        		b *= i;
//        	}
//        	System.out.println(b);
//        	
//        	for(int i = 1; i <= balls - share; i++){
//        		c *= i;
//        	}
//        	System.out.println(c);
//        	
//        	result = a / b / c;
//        	
//        } else if(balls - share == 0){
//        	result = 1;
//        }
        
        return result;
        
	}
}
