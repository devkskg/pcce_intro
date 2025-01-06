class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        sb.delete(n, sb.length());
        return answer = sb.toString();
    }
}