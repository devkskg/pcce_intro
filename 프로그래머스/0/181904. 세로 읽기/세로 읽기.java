class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int idx = 0;
        String[][] arr = new String[my_string.length() / m][m];

            
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = "";
                arr[i][j] += my_string.charAt(idx);
                idx++;
            }
        }
        
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr[i].length; j++){
        //         System.out.println(arr[i][j]);
        //     }
        // }
        
        for(int i = 0; i < arr.length; i++){
            answer += arr[i][c-1];
        }
        
        
        return answer;
    }
}