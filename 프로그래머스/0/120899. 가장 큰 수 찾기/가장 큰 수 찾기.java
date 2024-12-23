import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int idx = 0;
        
        List<Integer> list1 = new ArrayList<Integer>();
        
        for(int a : array){
            list1.add(a);
        }
        
        List<Integer> list2 = new ArrayList<Integer>(list1);
        
        Collections.sort(list2, Collections.reverseOrder());
        
        for(int i = 0; i < list1.size(); i++){
            
            if(list2.get(0) == list1.get(i)){
                idx = i;
                break;
            }
            
        }
        
        answer[0] = list2.get(0);
        answer[1] = idx;
        
        
        
        return answer;
    }
}