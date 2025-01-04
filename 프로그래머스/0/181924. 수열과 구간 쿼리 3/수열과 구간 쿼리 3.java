import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        Integer[] arrI = new Integer[arr.length];
        for(int i = 0; i < arrI.length; i++){
            arrI[i] = arr[i];
        }
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(arrI));
        
        
        // for(int i = 0; i < queries.length; i++){
        //     int idx1 = list.indexOf(queries[i][0]);
        //     int idx2 = list.indexOf(queries[i][1]);
        //    if(idx1 != -1 && idx2 != -1){
        //        int temp = list.get(idx1);
        //        list.set(idx1, list.get(idx2));
        //        list.set(idx2, temp);
        //    }
        //     System.out.println(list);
        // }
        
        for(int i = 0; i < queries.length; i++){
            int idx1 = (queries[i][0]);
            int idx2 = (queries[i][1]);
           if(idx1 != -1 && idx2 != -1){
               int temp = list.get(idx1);
               list.set(idx1, list.get(idx2));
               list.set(idx2, temp);
           }
        }
        
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}