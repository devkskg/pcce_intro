import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < intStrs.length; i++){
            sb.append(intStrs[i]);
            sb.delete(s+l, sb.length());
            sb.delete(0, s);
            String tempStr = sb.toString();
            int temp = Integer.parseInt(tempStr);
            if(temp > k){
                list.add(temp);
            }
            
            
            
            
            
            sb.delete(0, sb.length()+1);
        }
        
        
        
        
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}