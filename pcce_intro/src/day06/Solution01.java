package day06;

public class Solution01 {
	public static void main(String[] args) {
		String my = "jaron";
		String answer = "";
        for(int i = 0; i < my.length(); i++){
            answer += my.charAt((my.length() - 1)-i);
        }
        System.out.println(answer);
		
		
		
		
	}
}
