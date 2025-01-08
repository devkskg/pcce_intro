import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++){
            if(list.isEmpty()){
                list.add(arr[0]);
            } else if(list.indexOf(arr[i]) == -1){
                list.add(arr[i]);
            }
            if(list.size() == k){
                break;
            }
        }
        // System.out.println(list);
        
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        if(list.size() < k){
            for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
            }
        } else {
            for(int i = 0; i < k; i++){
            answer[i] = list.get(i);
            }
        }
        
        
        return answer;
    }
}