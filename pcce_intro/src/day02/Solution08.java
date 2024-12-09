package day02;

public class Solution08 {
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i] * 2;
		}
//        for(int i = 0; i < answer.length; i++) {
//        	answer[i] = answer[i] * 2;
//        }
        return answer;
    }
}
