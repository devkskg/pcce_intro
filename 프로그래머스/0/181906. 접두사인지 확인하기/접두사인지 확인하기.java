import java.util.*;
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(my_string);
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < my_string.length(); i++){
            list.add(sb.toString());
            sb.delete(sb.length()-1, sb.length());
        }
        
        if(list.indexOf(is_prefix) != -1){
            answer = 1;
        }
        
        return answer;
    }
}