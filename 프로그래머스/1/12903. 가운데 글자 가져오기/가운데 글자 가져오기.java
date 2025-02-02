class Solution {
    public String solution(String s) {
        String answer = "";
        int strLength = s.length();
        int a = strLength / 2;;
        
        if(strLength % 2 == 0){
            answer += s.charAt(a-1);
        }
        answer += s.charAt(a);
        
        
        return answer;
    }
}