import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] table = new int[201];
        
        for(int i = 0; i < lines.length; i++){
            for(int j = 0; j < lines[i].length; j++){
                lines[i][j] += 100;
            }
        }
        
//         0행 1행 두개 비교
        for(int i = lines[0][0]; i <= lines[0][1]; i++){
            table[i]++;
        }
        for(int i = lines[1][0]; i <= lines[1][1]; i++){
            table[i]++;
        }
        
        
        int start = 0;
        int end = 0;
        for(int i = 0; i < table.length; i++){
            if(table[i] == 2){
                start = i;
                break;
            }
        }
        for(int i = table.length - 1; i >= 0; i--){
            if(table[i] == 2){
                end = i;
                break;
            }
        }
        int l1 = end - start;
        
//         비교2
        Arrays.fill(table, 0);
        for(int i = lines[1][0]; i <= lines[1][1]; i++){
            table[i]++;
        }
        for(int i = lines[2][0]; i <= lines[2][1]; i++){
            table[i]++;
        }
        
        
        start = 0;
        end = 0;
        for(int i = 0; i < table.length; i++){
            if(table[i] == 2){
                start = i;
                break;
            }
        }
        for(int i = table.length - 1; i >= 0; i--){
            if(table[i] == 2){
                end = i;
                break;
            }
        }
        int l2 = end - start;

//         비교3
        Arrays.fill(table, 0);
        for(int i = lines[0][0]; i <= lines[0][1]; i++){
            table[i]++;
        }
        for(int i = lines[2][0]; i <= lines[2][1]; i++){
            table[i]++;
        }
        
        
        start = 0;
        end = 0;
        for(int i = 0; i < table.length; i++){
            if(table[i] == 2){
                start = i;
                break;
            }
        }
        for(int i = table.length - 1; i >= 0; i--){
            if(table[i] == 2){
                end = i;
                break;
            }
        }
        int l3 = end - start;        
        
//         다같이 겹치는 부분 있으면 빼는 메소드 추가 해야함
        for(int i = lines[1][0]; i <= lines[1][1]; i++){
            table[i]++;
        }
        start = 0;
        end = 0;
        for(int i = 0; i < table.length; i++){
            if(table[i] == 3){
                start = i;
                break;
            }
        }
        for(int i = table.length - 1; i >= 0; i--){
            if(table[i] == 3){
                end = i;
                break;
            }
        }
        int diff = end - start;   
        
        
        
        
        
        
        
        
        answer = l1 + l2 + l3 - diff*2;
        
        return answer;
    }
}