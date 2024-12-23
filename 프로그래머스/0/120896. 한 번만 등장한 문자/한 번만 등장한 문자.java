class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr1 = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr1[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == 1){
                
                int num = i + 'a';
                char ch = (char)num;
                answer += ch;
                
            }
        }
        return answer;
    }
}