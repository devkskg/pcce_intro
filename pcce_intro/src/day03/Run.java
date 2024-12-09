package day03;

import java.util.Scanner;


public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("solution 숫자 : ");
		int num = sc.nextInt();
		
		Solution01 s1 = new Solution01();
		Solution02 s2 = new Solution02();
		int[] arr = {1, 2, 7, 10, 11};
		Solution03 s3 = new Solution03();
		int[] s3Arr1 = {1, 2, 3, 3, 3, 4};
		int[] s3Arr2 = {1, 1, 2, 2};
		int[] s3Arr3 = {1};
		int[] s3Arr4 = {8, 4, 6, 6, 6, 7, 8, 8, 8};
		Solution04 s4 = new Solution04();
		int s4num = 4;
		
		
		
		switch(num) {
		case 1 : System.out.println(s1.solution(100, 3));
		break;
		
		case 2 : System.out.println(s2.solution(arr));
		break;
		
		case 3 : System.out.println(s3.solution(s3Arr4));
		break;
		
		case 4 : for(int i = 0; i < s4num; i++) {
			System.out.println(s4.solution(s4num));
		}
		break;
		
//		case 5 : System.out.println(s5.solution(16));
		}
		
		sc.close();
		
	}

}
