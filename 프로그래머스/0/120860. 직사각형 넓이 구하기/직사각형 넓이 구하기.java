class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = 0;
        int height = 0;
        
//         가로 구하기
        for(int i = 1; i < dots.length; i++){
            // dot[0][i-1] - dot[0][i];
            if(dots[i-1][0] - dots[i][0] != 0){
                width = Math.abs(dots[i-1][0] - dots[i][0]);
            }
            if(dots[i-1][1] - dots[i][1] != 0){
                height = Math.abs(dots[i-1][1] - dots[i][1]);
            }
            
            
        }
        answer = width * height;
        
        
        
        
//         세로 구하기
        
        
        
        
        
        
        return answer;
    }
}