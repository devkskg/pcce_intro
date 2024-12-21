package day10;

public class Solution04_1 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };
		String direction = "right";
		
//		주석과 같이 해버리면 answer과 numbers가 서로 영향을 줘서 예상치 못한 결과가 나오게 됨.
//		int[] answer = numbers;
		int[] answer = new int[numbers.length];

		int first = numbers[0];
		int last = numbers[numbers.length - 1];

		
		if (direction.equals("right")) {
			for (int i = 1; i < answer.length; i++) {
				answer[i] = numbers[i - 1];
			}
			answer[0] = last;
		} else if (direction.equals("left")) {
			for (int i = answer.length - 2; i >= 0; i--) {
				answer[i] = numbers[i + 1];
				answer[answer.length - 1] = first;
			}
		}

		for (int a : answer) {
			System.out.println(a);
		}

	}

}
