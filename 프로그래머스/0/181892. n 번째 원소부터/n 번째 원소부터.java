import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<Integer>();
        int[] answer = new int[num_list.length - n + 1];
        for(int i = n-1; i < num_list.length; i++){
            list.add(num_list[i]);
        }
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}