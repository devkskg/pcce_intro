package day02;

public class Run {

	public static void main(String[] args) {
		Solution05 s5 = new Solution05();
		int n5 = s5.solution(7, 3);
		System.out.println("3, 2 : " + n5);
		
		Solution06 s6 = new Solution06();
		int n6 = s6.solution(2, 3);
		System.out.println("2, 3 : " + n6);
		
		Solution07 s7 = new Solution07();
		int[] n7 = s7.solution(1, 2, 3, 4);
		System.out.println("1 2 3 4 ");
		for(int i = 0; i < n7.length; i++) {
			System.out.print(n7[i] + ", ");
		}
		
		
		Solution08 s8 = new Solution08();
		int[] nn = {1, 2, 3, 4, 5};
		int[] n8 =  s8.solution(nn);
		System.out.println("1 2 3 4 5");
		for(int i = 0; i < n8.length; i++) {
			System.out.print(n8[i] + ", ");
		}


	}

}
