import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < attendance.length; i++){
            if(attendance[i]){
                list.add(rank[i]);
            }
        }
        Collections.sort(list);
        for(int i = 0; i < rank.length; i++){
            if(rank[i] == list.get(0)){
                idx1 = i;
            } else if(rank[i] == list.get(1)){
                idx2 = i;
            } else if(rank[i] == list.get(2)){
                idx3 = i;
            }
        }
        
        answer = 10000 * idx1 + 100 * idx2 + idx3;
        
        return answer;
    }
}