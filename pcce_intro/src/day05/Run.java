package day05;

import day05.Solution01;
import day05.Solution02;
import day05.Solution03;
import day05.Solution04;

public class Run {

	public static void main(String[] args) {
		
		Solution01 s1 = new Solution01();
		Solution02 s2 = new Solution02();
		Solution03 s3 = new Solution03();
		Solution04 s4 = new Solution04();
		
		System.out.println("1번");
		System.out.println(s1.solution(150000));
		
		System.out.println("2번");
		int[] arr = s2.solution(5500);
		
		for(int a : arr) {
			System.out.println(a);
		}
		
		System.out.println("3번");
		System.out.println(s3.solution(40));
		
		System.out.println("4번");
		int[] s4Arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int[] s4Arr2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		System.out.println(s4.solution(s4Arr1));

	}

}
