class Solution {
    public int solution(int n) {
        int answer = 2;
        double sq = Math.sqrt(n);
        if((int)sq*sq == n){
            answer = 1;
        }
        
        
        return answer;
    }
}