import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < indices.length; i++){
            list.add(indices[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int i = 0; i < list.size(); i++){
            sb.delete(list.get(i),list.get(i)+1);    
        }
        answer = sb.toString();
        
        return answer;
    }
}