class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i % 2 == 0){
                sumOdd += num_list[i];
            } else if(i % 2 == 1){
                sumEven += num_list[i];
            }
        }
        
        if(sumOdd > sumEven){
            answer = sumOdd;
        } else if(sumOdd <= sumEven){
            answer = sumEven;
        }
        
        return answer;
    }
}