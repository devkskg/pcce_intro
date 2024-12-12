package day06;

public class EachNumberAdd {
	public static void main(String[] args) {
		int n = 1234;
		int k = 1000000;
		int answer = 0;
		while(true) {
			int z = 0;
			if(k > 0) {
				z = n / k;
				answer += z;
				n = n - (z) * k;
				k = k / 10;
			} else if(k <= 0) {
				break;
			}
		}
		
		System.out.println(answer);
		
		
	}
}
