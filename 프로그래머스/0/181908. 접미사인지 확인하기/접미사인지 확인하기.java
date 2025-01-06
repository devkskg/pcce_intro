import java.util.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder(my_string);
        List<String> list = new ArrayList<String>();
        
        for(int i = 0; i < my_string.length(); i++){
            list.add(sb.toString());
            sb.delete(0,1);
        }
        
        if(list.indexOf(is_suffix) != -1){
            answer = 1;
        }
        
        return answer;
    }
}