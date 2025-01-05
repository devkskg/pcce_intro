class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            String temp = "";
            
            for(int j = e; j >= s; j--){
                temp += sb.charAt(j);
            }
            sb.delete(s, e+1);
            sb.insert(s, temp);
            
        }
        answer = sb.toString();
        return answer;
    }
}