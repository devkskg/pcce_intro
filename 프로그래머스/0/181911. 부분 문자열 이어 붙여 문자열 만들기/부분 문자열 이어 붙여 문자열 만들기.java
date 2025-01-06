class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < parts.length; i++){
            int s = parts[i][0];
            int e = parts[i][1];
            StringBuilder sb = new StringBuilder(my_strings[i]);
            sb.delete(e+1, sb.length()+1);
            sb.delete(0, s);
            answer.append(sb);
        }
        return answer.toString();
    }
}