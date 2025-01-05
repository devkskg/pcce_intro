import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        list.add(n);
        
        while(true){
            if(n == 1){
                break;
            }
            
            if(n % 2 == 0){
                n /= 2;
            } else if(n % 2 == 1){
                n = 3 * n + 1;
            }
            list.add(n);
            
            
            
        }
        
        
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}