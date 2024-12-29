import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int a = total / num;
        int b = total % num;
        List<Integer> list = new ArrayList<Integer>();
        
        // 0 +1 +2    +3    +4 +5 +6    +7 = 28 = 3*8    + 4
//         total / num 을 기준으로
//         total % num 만큼 +자리 있음
//         밑으로는 --하면서 num 갯수 채워주면 될듯
        if(num % 2 == 1){
            list.add(a);
            for(int i = 1; i <= num/2; i++){
                list.add(a + i);
                list.add(a - i);
            }
        } else if(num % 2 != 1){
            list.add(a);
            for(int i = 1; i <= num/2; i++){
                list.add(a + i);
                list.add(a - i);
            }
            list.remove(list.indexOf(a-b));
        }
        
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}