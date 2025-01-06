import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < num_list.length; i++){
            list.add(num_list[i]);
        }
        Collections.sort(list);
        
        list.subList(5, list.size()).clear(); // 이거 좋구만
        
        
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}