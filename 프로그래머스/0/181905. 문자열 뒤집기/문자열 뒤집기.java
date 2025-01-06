class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String temp = "";
        String temp2 = "";
        StringBuilder sb = new StringBuilder(my_string);
        temp += sb.toString().substring(0, s);
        
        temp2 = sb.toString().substring(s, e+1);
        StringBuilder sb2 = new StringBuilder(temp2);
        
        temp += sb2.reverse();
        
        temp += sb.toString().substring(e+1, sb.length());
        
        answer = temp;
        
        return answer;
    }
}