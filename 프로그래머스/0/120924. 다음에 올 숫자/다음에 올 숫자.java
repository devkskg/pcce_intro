import java.util.*;

class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int count = 0;
        int diff1 = common[1] - common[0];
        
        List<Integer> list = new ArrayList<Integer>();
        
        
//         등차일 경우
//         i, i-1의 차가 같다
        for(int i = 1; i < common.length; i++){
            list.add(common[i] - common[i-1]);
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) != diff1){
                count++;
            }
        }
        
        if(count == 0){
            answer = common[common.length-1] + diff1;
        } else{
            int diff2 = common[1] / common[0];
            answer = common[common.length-1] * diff2;
        }
        
        
        
//         등차||등비 경우만 존재함
//         등비일 경우
//         i / (i-1)이 같다.
        
        
        
        
        
        
        return answer;
    }
}