package day10;

public class Solution01 {
	public static void main(String[] args) {
        
		int[] dot = {2, 4};
//		int[] dot = {-7, 9};
		int answer = 0;
		
		
        if(dot[0] > 0 && dot[1] > 0){
            answer = 1;
        } else if(dot[0] < 0 && dot[1] > 0){
            answer = 2;
        } else if(dot[0] < 0 && dot[1] < 0){
            answer = 3;
        } else if(dot[0] > 0 && dot[1] < 0){
            answer = 4;
        }
        
        System.out.println(answer);
	}
}
