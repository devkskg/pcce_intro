package day01;

public class Run {

	public static void main(String[] args) {
		Solution01 s1 = new Solution01();
		int n1 = s1.solution(2, 3);
		System.out.println("2, 3일 때 : " + n1);
		
		Solution02 s2 = new Solution02();
		int n2 = s2.solution(3, 1);
		System.out.println("3, 1 : " + n2);
		
		Solution03 s3 = new Solution03();
		int n3 = s3.solution(2, 4);
		System.out.println("2, 4 : " + n3);
		
		Solution04 s4 = new Solution04();
		int n4 = s4.solution(4, 2);
		System.out.println("4, 2 : " + n4);
		
		Solution05 s5 = new Solution05();
		int n5 = s5.solution(7, 3);
		System.out.println("3, 2 : " + n5);
		
		Solution06 s6 = new Solution06();
		int n6 = s6.solution(2, 3);
		System.out.println("2, 3 : " + n6);
		
		
		
		
		Solution08 s8 = new Solution08();
		int[] numbers =  s8.solution({8, 2});
		System.out.println("2, 3 : " + numbers[0]);
		
		

	}

}
