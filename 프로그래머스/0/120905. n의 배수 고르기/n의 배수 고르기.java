import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        List<Integer> list1 = new ArrayList<Integer>();
        for(int nu : numlist){
            list1.add(nu);
        }
        
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < list1.size(); i++){
            if(list1.get(i) % n == 0){
                list2.add(list1.get(i));
            }
        }
        
        
        
        int[] answer = new int[list2.size()];
        
        for(int i = 0; i < list2.size(); i++){
            answer[i] = list2.get(i);
        }
        
        
        return answer;
    }
}