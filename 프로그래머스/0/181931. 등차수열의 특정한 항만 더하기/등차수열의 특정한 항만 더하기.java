import java.util.*;
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int sum = a;
//         
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < included.length; i++){
            list.add(sum);
            sum += d;
        }
        
        for(int i = 0; i < included.length; i++){
            if(included[i]){
                answer += list.get(i);
            }
        }
        
        return answer;
    }
}