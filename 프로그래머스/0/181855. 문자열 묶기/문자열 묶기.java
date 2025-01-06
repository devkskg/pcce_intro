import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        int[] arr = new int[31];
        for(int i = 0; i < strArr.length; i++){
            arr[strArr[i].length()]++;
        }
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        answer = list.get(0);
        
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == big){
        //         answer = i;
        //         break;
        //     }
        // }
        
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = i+1; j < arr.length){
        //         int temp = arr[0];
        //         if(big < arr[i]){
        //             big = arr[i];
        //         }
        //     }
        // }
        
        return answer;
    }
}