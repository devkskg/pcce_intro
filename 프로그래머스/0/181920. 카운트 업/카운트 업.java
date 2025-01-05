class Solution {
    public int[] solution(int start_num, int end_num) {
        
        int l = end_num - start_num + 1;
        int[] answer = new int[l];
        int cnt = start_num;
        
        for(int i = 0; i < l; i++){
            answer[i] = cnt;
            cnt++;
        }
        
        return answer;
    }
}