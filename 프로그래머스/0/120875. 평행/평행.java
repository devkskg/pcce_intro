class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        // double[] slope = new double[6];
        // int count = 0;
        
//         for(int i = 0; i < dots.length-1; i++){
//             for(int j = i+1; j < dots.length; j++){
//                     slope[count++] = (dots[j][1] - dots[i][1])/(double)((dots[j][0] - dots[i][0]));
//             }
//         }
        
//         for(int i = 0; i < slope.length - 1; i++){
//             for(int j = i + 1; j < slope.length; j++){
//                 if(slope[i] == slope[j]){
//                     answer = 1;
//                 }
//             }
//         }
//         정답처리 이상한데..
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        
        int x4 = dots[3][0];
        int y4 = dots[3][1];
        
        double slope1 = (double)(y2 - y1) / (x2 - x1);
        double slope2 = (double)(y4 - y3) / (x4 - x3);
        if(slope1 == slope2) answer = 1;
        
        double slope3 = (double)(y3 - y1) / (x3 - x1);
        double slope4 = (double)(y2 - y4) / (x2 - x4);
        if(slope3 == slope4) answer = 1;
        
        double slope5 = (double)(y4 - y1) / (x4 - x1);
        double slope6 = (double)(y2 - y3) / (x2 - x3);
        if(slope5 == slope6) answer = 1;
        
        
        
        return answer;
    }
}