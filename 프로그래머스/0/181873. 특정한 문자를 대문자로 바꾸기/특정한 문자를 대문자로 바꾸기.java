class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            String temp = "";
            temp += my_string.charAt(i);
            if(temp.equals(alp)){
                answer += alp.toUpperCase();
            } else{
                answer += temp;
            }
        }
        return answer;
    }
}