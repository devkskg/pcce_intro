class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        // StringBuilder sb = new StringBuilder(my_string);
        // sb.delete(s, sb.length());
        // sb.append(overwrite_string);
        // answer = sb.toString();
        for(int i = 0; i < s; i++){
            answer += my_string.charAt(i);
        }
        for(int i = 0; i < overwrite_string.length(); i++){
            answer += overwrite_string.charAt(i);
        }
        if(s+overwrite_string.length() < my_string.length()){
            for(int i = s+overwrite_string.length(); i < my_string.length(); i++){
            answer += my_string.charAt(i);
            }
        }
        
        return answer;
        
    }
}