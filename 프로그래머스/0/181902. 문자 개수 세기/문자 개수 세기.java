class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            if('a' <= my_string.charAt(i) && my_string.charAt(i) <= 'z'){
                answer[my_string.charAt(i) - 'a' + 26]++;
            } else if('A' <= my_string.charAt(i) && my_string.charAt(i) <= 'Z'){
                answer[my_string.charAt(i) - 'A']++;
            }
        }
        return answer;
    }
}