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
		
		
//<<<<<<< HEAD
//=======
		Solution06 s6 = new Solution06();
		int n6 = s6.solution(2, 3);
		System.out.println("2, 3 : " + n6);
		
		
		
		
		Solution08 s8 = new Solution08();
		// 강의 중 알려주신 것. 중요!!!
//		배열을 매개변수로 써야할 때
//		방법 1.
//		int[] nums = {1,2,3};
//		s8.solution(nums);
//		방법2
//		int[] num2 = new int[] {1,2,3,4,};
//		s8.solution(new int[] {1,2,3,4,});
		
		
//		int[] numbers =  s8.solution({8, 2});
//		System.out.println("2, 3 : " + numbers[0]);
//>>>>>>> branch 'master' of https://github.com/devkskg/pcce_intro.git
		
		

	}

}
