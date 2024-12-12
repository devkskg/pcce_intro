package day06;

public class EachNumberAdd {
	public static void main(String[] args) {
		int n = 1234;
		int k = 1000000;
		int answer = 0;
		while(true) {
			int z = 0;
			if(k >= 1) {
				z = n / k;
				answer += z;
				n = (z) * k;
				k /= 10;
			} else if(k < 0) {
				break;
			}
		}
		
		System.out.println(answer);
		
		
	}
}
