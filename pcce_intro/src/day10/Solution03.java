package day10;

public class Solution03 {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3};
		int k = 3;
		
//		2k - 1   | - 1
//		int y = (2*5 - 1) % (6) - 1;
		
//		내가 작성한 코드는 이건데 뤼튼이 판단하기로는
//		인덱스가 음수가 나올 수 있는 가능성이 있다고 한다.
//		int i = ((2*k - 1) % (numbers.length)) - 1;
		
//		아래는 수정 받은 코드
		int i = (2*(k - 1)) % (numbers.length);
		
		
		
		
		System.out.println(numbers[i]);
//		System.out.println(numbers[y]);
	}
}
