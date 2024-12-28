class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int ch = chicken;
        
        while(true){
            if(ch < 10){
                break;
            }
            answer += ch / 10;
            ch = (ch / 10) + (ch % 10);
            
        }
        return answer;
    }
}