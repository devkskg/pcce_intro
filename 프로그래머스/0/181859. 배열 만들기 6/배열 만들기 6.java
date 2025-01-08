import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        int i = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(i = 0; i < arr.length; i++){
            if(list.isEmpty()){
                list.add(arr[i]);
            } else if(!list.isEmpty() && list.get(list.size()-1) == arr[i]){
                list.remove(list.size()-1);
            } else if(!list.isEmpty() && list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
            }
            // System.out.println(list);
        }
        
        int[] answer = new int[list.size()];
        for(int j = 0; j < answer.length; j++){
            answer[j] = list.get(j);
        }
        if(list.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}