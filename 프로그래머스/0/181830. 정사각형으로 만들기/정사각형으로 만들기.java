import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = null;
        int r = arr.length;
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            if(c < arr[i].length){
                c = arr[i].length;
            }
        }
        if(r > c){
            answer = new int[r][r];
            for(int i = 0; i < r; i++){
                Arrays.fill(answer[i], 0);
            }
        } else{
            answer = new int[c][c];
            for(int i = 0; i < c; i++){
                Arrays.fill(answer[i], 0);
            }
        }
        // Arrays.fill(answer, 0);
        
        for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    
                        answer[i][j] = arr[i][j];
                    
                }
            }
        
        return answer;
    }
}