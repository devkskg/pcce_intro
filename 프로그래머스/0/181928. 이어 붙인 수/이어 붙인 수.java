class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String strOdd = "";
        String strEven = "";
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
               strEven += String.valueOf(num_list[i]);
            } else if(num_list[i] % 2 == 1){
                strOdd += String.valueOf(num_list[i]);
            }
        }
        answer = Integer.parseInt(strOdd) + Integer.parseInt(strEven);
        
        return answer;
    }
}