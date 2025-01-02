class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int l = num_list.length;
        System.arraycopy(num_list, 0, answer, 0, l);
        if(num_list[l-2] < num_list[l-1]){
            answer[l] = num_list[l-1] - num_list[l-2];
        } else if(num_list[l-2] >= num_list[l-1]){
            answer[l] = num_list[l-1]*2;
        }
        
        return answer;
    }
}