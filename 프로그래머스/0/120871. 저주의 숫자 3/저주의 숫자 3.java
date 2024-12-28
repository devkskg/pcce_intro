import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        for(int i = 1; i <= 1000; i++){
            if(Integer.toString(i).indexOf("3") == -1 && i % 3 != 0){
                list.add(i);
            }
        }
        answer = list.get(n);
        
//         for(int i = 1; i <= n; i++){
//             if(Integer.toString(i).indexOf("3") != -1 || i % 3 == 0){
//                 count++;
//             }
//         }
//         answer += count;
        
//         while(true){
//             if(Integer.toString(answer).indexOf("3") == -1 && answer % 3 != 0){
//                 break;
//             } else if(Integer.toString(answer).indexOf("3") != -1 || answer % 3 == 0){
//                 // for(int i = 1; i <= n; i++){
//                 //     if(Integer.toString(i).indexOf("3") != -1 || i % 3 == 0){
//                 //         count++;
//                 //     }
//                 // }
//                 answer++;
//             }
//         }
        
        
        // while(true){
        //     String temp = Integer.toString(n);
        //     if(temp.indexOf("3") != -1){
        //         n++;
        //     }
        //     if(n % 3 == 0){
        //         n++;
        //     }
        //     if(n % 3 != 0 && Integer.toString(n).indexOf("3") == -1){
        //         break;
        //     }
        //     count++;
        // }
        
        return answer;
    }
}