import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        StringBuilder sb = new StringBuilder(my_string);
        List<String> list = new ArrayList<String>();
        
        for(int i = 0; i < my_string.length(); i++){
            list.add(sb.toString());
            sb.delete(0, 1);
        }
        Collections.sort(list);
        String[] answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}