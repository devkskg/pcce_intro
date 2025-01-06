import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < num_list.length; i++){
            list.add(num_list[i]);
        }
        Collections.sort(list);
        // list.remove(5, list.size()); -> list.remove(idx);
        
        // List<Integer> list2 = new ArrayList<Integer>();
        int[] answer = new int[list.size()-5];
        for(int i = 0; i < 5; i++){
            list.remove(0);
        }
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}