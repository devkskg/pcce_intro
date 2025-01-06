class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = arr;
        if(k % 2 == 1){
            for(int i = 0; i < answer.length; i++){
                answer[i] = answer[i]*k;
            }
        } else if(k % 2 == 0){
            for(int i = 0; i < answer.length; i++){
                answer[i] = answer[i]+k;
            }
        }
        return answer;
    }
}