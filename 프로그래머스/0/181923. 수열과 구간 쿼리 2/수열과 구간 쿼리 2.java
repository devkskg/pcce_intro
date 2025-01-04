import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[queries.length];
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j = s; j <= e; j++){
                if(arr[j] > k){
                    list.add(arr[j]);
                }
            }
            
            if(list.isEmpty()){
                answer[i] = -1;
            } else{
                Collections.sort(list);
                answer[i] = list.get(0);
            }
            
            list.clear();
        }
        
        
        
        
        return answer;
    }
}