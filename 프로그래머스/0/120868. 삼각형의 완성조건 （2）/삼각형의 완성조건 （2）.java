class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        if(sides[0] > sides[1]){
            int temp = sides[0];
            sides[0] = sides[1];
            sides[1] = temp;
        }
        
        int sideSum = sides[0] + sides[1];
        
        for(int i = 1; i < sideSum; i++){
            if(sides[1] < i + sides[0] && sides[1] >= i){
                answer++;
            } else if(i < sides[0] + sides[1] && sides[1] < i){
                answer++;
            }
            
        }
            
            
            
        
        
        
        
        
        
        return answer;
    }
}