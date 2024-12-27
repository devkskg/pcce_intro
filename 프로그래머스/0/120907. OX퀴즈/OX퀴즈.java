import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
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
        
        return answer;
    }
}