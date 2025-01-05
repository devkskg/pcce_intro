import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer;
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = l; i <= r; i++){
            String temp = String.valueOf(i);
            String str = "";
            for(int j = 0; j < temp.length(); j++){
                if(temp.charAt(j) == '5' || temp.charAt(j) == '0'){
                    str += temp.charAt(j);
                } else{
                    str = "";
                    break;
                }
            }
            if(str.length() != 0){
                list.add(Integer.parseInt(str));
            }
            
        }
        
        
        if(list.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        } else{
            Collections.sort(list);
            answer = new int[list.size()];
            for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
            }
        }
        
        
        
        
        
        
        
        return answer;
    }
}