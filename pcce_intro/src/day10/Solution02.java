package day10;

public class Solution02 {
	public static void main(String[] args) {
		int[] num_list = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 2;
//		int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
//		int n = 3;
		int[][] answer = new int[num_list.length / n][n];
//		int x = -1;
		int y = 0;
//		System.out.println(num_list[1]);
		for (int i = 0; i < num_list.length / n; i++) {
			for (int j = 0; j < n; j++) {
				answer[i][j] = num_list[y++];
			}
		}
		System.out.println(answer[0][0]);
	}
}
