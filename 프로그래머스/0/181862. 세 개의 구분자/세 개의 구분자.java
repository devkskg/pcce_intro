import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<String>();
        String[] answer = null;
        String temp = "";
        
        for(int i = 0; i < myStr.length(); i++){
            
            if(myStr.charAt(i) != 'a' && myStr.charAt(i) != 'b' && myStr.charAt(i) != 'c'){
                temp += myStr.charAt(i);
            } else if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c'){
                if(!temp.equals("")){
                    list.add(temp);
                    temp = "";
                }
            }
            if(i == myStr.length() -1){
                if(!temp.equals("")){
                    list.add(temp);
                }
            }
            // System.out.println(temp);
            
        }
        
        if(list.isEmpty()){
            answer = new String[1];
            answer[0] = "EMPTY";
        } else{
            answer = new String[list.size()];
            for(int i = 0; i < answer.length; i++){
                answer[i] = list.get(i);
            }
        }
        
        
        return answer;
    }
}