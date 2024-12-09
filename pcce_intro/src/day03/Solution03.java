package day03;

public class Solution03 {
	public int solution(int[] array) {
        int answer = 0;
        int count = 0;
        int k = 0;
        int s = 0;
        int x = array[0];
       
int[] cArr = new int[99];

        
        
        int i = 0;
        int j = 0;
        for(i = 0; i < array.length -1; i++) {
        	for(j = i + 1; j < array.length; j++) {
        		if(array[i] > array[j]) {
        			int temp = array[i];
        			array[i] = array[j];
        			array[i] = temp;
        		}
        		
        	}
        }
        while(true) {
        	for(i = k; i < array.length -1; i++) {
        		for(j = i + 1; j < array.length; j++) {
        			if(array[i] == array[j]) {
        				count++;
        			} else {
        				k = array[j];
        			}
        		}
        		cArr[i] = count;
        		count = 0;
        	}
        	if(i == array.length -1) {
        		break;
        	}
        }
        
        int max = cArr[0];
        for(i = 0; i < cArr.length; i++) {
        	if(cArr[i] > max) {
        		max = cArr[i];
        		s = i;
        	}
        }
        
        
        for(i = 0; i < cArr.length -1; i++) {
        	for(j = i + 1; j < cArr.length; j++) {
        		if(cArr[i] < cArr[j]) {
        			int temp = cArr[i];
        			cArr[i] = cArr[j];
        			cArr[j] = temp;
        		}
        		
        	}
        }
        
        
        if(array.length == 1) {
        	answer = x;
        	return answer;
        }
        
        if(cArr[0] == cArr[1]) {
        	answer = -1;
        	return answer;
        } else {
        	answer = array[s];
        	return answer;
        }
        
    }

}
