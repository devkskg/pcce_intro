class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int l = my_string.length();
        
        StringBuilder sb = new StringBuilder(my_string);
        sb.delete(0, l-n);
        answer = sb.toString();
        
        return answer;
    }
}