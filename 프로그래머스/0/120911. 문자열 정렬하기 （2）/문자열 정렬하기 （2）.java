import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        
        List<String> list = new ArrayList<String>();
        
        for(int i = 0; i < my_string.length(); i++){
            String temp = "";
            temp += my_string.charAt(i);
            list.add(temp);
        }
        Collections.sort(list);
        for(String l : list){
            answer += l;
        }
        
        
        return answer;
    }
}