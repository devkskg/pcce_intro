import java.util.*;

class Solution {
    public int[] solution(int n) {
        int j = 0;
        
        List<Integer> list1 = new ArrayList<Integer>();
        
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                list1.add(i);
            }
        }
        
        for(int i = 0; i < list1.size(); i++){
            for(int k = 2; k <= list1.get(i); k++){
                if(list1.get(i) % k == 0 && list1.get(i) != k){
                    list1.set(i, 0);
                }
            }
        }
        
        Collections.sort(list1);
        
        while(true){
            if(list1.indexOf(0) != -1){
            list1.remove(0);
            } else{
            break;
            }
        }
        
      
        
        int[] answer = new int[list1.size()];
     
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list1.get(i);
        }
        
 
        
        return answer;
    }
}