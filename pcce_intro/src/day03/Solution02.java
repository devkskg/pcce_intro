package day03;

public class Solution02 {
	public int solution(int[] array) {
		int answer = 0;
        for(int i = 0; i < array.length - 1; i++) {
        	for(int j = i + 1; j < array.length; j++) {
        		if(array[i] > array[j]) {
        			int temp = array[i];
        			array[i] = array[j];
        			array[j] = temp;
        		}
        	}
        }
        answer = array[array.length / 2 + 1 -1];
//        String[] str = new String[array.length];
//        for(int i = 0; i < array.length; i++) {
//        	str[i] = array[i];
//        }
        return answer;
    }
}
//01 02 03 04
//12 13 14