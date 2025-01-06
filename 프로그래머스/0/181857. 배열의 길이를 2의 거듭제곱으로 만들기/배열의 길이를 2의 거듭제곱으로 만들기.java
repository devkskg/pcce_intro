class Solution {
    public int[] solution(int[] arr) {
        int idx = 1;
        int pow = 0;
        
        while(idx < arr.length){
            idx *= 2;
        }
        
        int[] answer = new int[idx];
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}