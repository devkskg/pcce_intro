import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < my_string.length(); i++){
            if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9'){
                list.add(my_string.charAt(i) - '0');
            }
        }
        
        
        int[] answer = new int[list.size()];
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}