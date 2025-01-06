import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int s = 0;
        int e = 0;
        int[] answer = new int[1];
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                s = i;
                break;
            }
        }
        for(int i = arr.length -1; i >= 0; i--){
            if(arr[i] == 2){
                e = i;
                break;
            }
        }
        for(int i = s; i <= e; i++){
            list.add(arr[i]);
        }
        
//         int[] answer = new int[list.size()];
//         for(int i = 0; i < answer.length; i++){
//             answer[i] = list.get(i);
//         }
        
//         if(list.isEmpty()){
//             answer = new int[1];
//             answer[0] = -1;
//         }
        
        if(e == 0 && s == 0 && arr[0] != 2){
            answer[0] = -1;
        } else{
            answer = new int[list.size()];
            for(int i = 0; i < answer.length; i++){
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}