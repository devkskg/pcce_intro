package day00;

import java.util.ArrayList;
import java.util.List;

public class OXquiz {

	public static void main(String[] args) {
		
//		String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
		String[] quiz = {"-3 - -3 = 0"};
		String[] answer = new String[quiz.length];
		List<Integer> list = new ArrayList<Integer>();
		String temp = "";
		int t = 0;
		
		for(int i = 0; i < quiz.length; i++) {
			list.clear();
			temp = "";
			t = 0;
			
			for(int j = 0; j < quiz[i].indexOf("="); j++) {
				
				
				if('0' <= quiz[i].charAt(j) && quiz[i].charAt(j) <= '9') {
					temp += quiz[i].charAt(j) - '0';
					
				}  else if(quiz[i].charAt(j) == '-' ){

					if(temp.equals("-")) {
						temp = "+";
					} else {
						temp = "-";
					}
                    
                } else if(quiz[i].charAt(j) == '+'){
                    temp = "+";
                    
                } 
				System.out.println(temp + "temp");
				
				if(temp != "" && temp != "+" && temp != "-" && quiz[i].charAt(j) == ' ') {
					list.add(Integer.parseInt(temp));
					System.out.println(Integer.parseInt(temp) + "temp 저장");
					temp = "";
				}
				
			}
			
			
			
			temp = "";
			
			
			
			for(int j = quiz[i].lastIndexOf(" "); j < quiz[i].length(); j++) {
				
				if('0' <= quiz[i].charAt(j) && quiz[i].charAt(j) <= '9') {
					temp += quiz[i].charAt(j) - '0';
					
				} else if(quiz[i].charAt(j) == '-' ){
					
					if(temp.equals("-")) {
						temp = "+";
					} else {
						temp = "-";
					}
                    
                } else if(quiz[i].charAt(j) == '+'){
                    temp = "+";
                    
                } 
			}
			
			
			for(int z = 0; z < list.size(); z++) {
				t += list.get(z);
			}
			System.out.println(t);
			System.out.println(Integer.parseInt(temp));
			if(t == Integer.parseInt(temp)) {
				answer[i] = "O";
			} else {
				answer[i] = "X";
			}
			
		}
		for(String a : answer) {
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<Integer> list = new ArrayList<Integer>();
//		String str1 = "0-3";
//		int num1 = Integer.parseInt(str1);
//		list.add(num1);
////		boolean num2 = Boolean.parseBoolean(num1);
////		if(num1) {
////			System.out.println("참");
////		} else {
////			System.out.println("거짓");
////		}
//		System.out.println(list.get(0));
		
	}

}
