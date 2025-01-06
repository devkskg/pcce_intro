import java.util.*;
class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<String>();
        String[] temp = myString.split("x");
        
        for(int i = 0; i < temp.length; i++){
            if(!temp[i].equals("")){
                list.add(temp[i]);
            }
            
        }
        
        
        Collections.sort(list);
        String[] answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}