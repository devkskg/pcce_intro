import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int count = 0;
        
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        
        for(int i = 0; i < array.length; i++){
            list1.add(array[i]);
            list2.add(Math.abs(array[i] - n));
        }
        List<Integer> list3 = new ArrayList<Integer>(list2);
        List<Integer> list4 = new ArrayList<Integer>();
        
        Collections.sort(list2);
        
        for(int i = 0; i < list1.size(); i++){
            if((n - list2.get(0)) == list1.get(i) || (n + list2.get(0)) == list1.get(i)){
                list4.add(list1.get(i));
            }
        }
        Collections.sort(list4);
        answer = list4.get(0);
        
        
//         int idx = list3.indexOf(list2.get(0));
//         int idx2 = 0;
        
//         answer = list1.get(idx) + n;
        
//         if(list2.get(0) == list2.get(1)){
//             idx = list3.indexOf(list2.get(0) * (-1));
//             answer = list1.get(idx) + n;
//         }
        
//         if(array.length == 1){
//             answer = array[0];
//         } else{
//             for(int i = 1; i < list1.size(); i++){
//             if(list2.get(i) == list2.get(i-1)){
//                 count++;
//             } else{
//                 break;
//             }
//         }
         
//             answer = list1.get(idx - count) + n;
        
            
//         }
        
//         int count = 0;
//         if(array.length != 1){
//         for(int i = 1; i < list1.size(); i++){
//             if(list2.get(i) == list2.get(i-1)){
//                 count++;
//             } else{
//                 break;
//             }
//         }
        
//         if(count > 0){
//             answer = list1.get(idx - count) + n;
//         } else{
//             answer = list1.get(idx) + n;
//         }
//         } else{
//             answer = array[0];
//         }    
        
        return answer;
    }
}