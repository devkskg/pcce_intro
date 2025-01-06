import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        // int query[0] = a;
        // int query[1] = b;
        // int query[2] = c;
        List<Integer> list = new ArrayList<Integer>();
        int[] temp = new int[arr.length];
        
        
        
        for(int i = 0; i < temp.length; i++){
            temp[i] = arr[i];
        }
        
        
        
        
        
        for(int i = 0; i < query.length; i++){
            
            if(i % 2 == 0){
                for(int j = 0; j <= query[i]; j++){
                    list.add(temp[j]);
                }
            } else if(i % 2 == 1){
                for(int j = query[i]; j < temp.length; j++){
                    list.add(temp[j]);
                }
            }
            
            temp = new int[list.size()];
            for(int j = 0; j < temp.length; j++){
            temp[j] = list.get(j);
            }
            list.clear();
            
            }
            
        
        
        // int[] answer = new int[list.size()];
        // for(int i = 0; i < answer.length; i++){
        //     answer[i] = list.get(i);
        // }
        return temp;
    }
}