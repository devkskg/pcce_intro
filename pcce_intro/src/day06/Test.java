package day06;

public class Test {
	public static void main(String[] args) {
//		1/2 + 3/4
		int numer1 = 1;
		int denom1 = 2;

		int numer2 = 1;
		int denom2 = 4;
		
		int x = denom1 * denom2;
		int y = (denom1*numer2) + (denom2*numer1);
		
		int a = x;
		int b = y;
		
		System.out.println("a는:" + a);
		System.out.println("b는:" + b);
		System.out.println("====");
		
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
			System.out.println("a는:" + a);
			System.out.println("b는:" + b);
		}
		
		System.out.println(a);
		x = x / a;
		y = y / a;
		
		int[] answer = new int[2];
		answer[0] = y;
		answer[1] = x;
		
		System.out.println("분자 : " + y);
		System.out.println("분모 : " + x);
		
		
	}
}
