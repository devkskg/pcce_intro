class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        int idx = n-1;
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[i];
        }
        
        
        return answer;
    }
}