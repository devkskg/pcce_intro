class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        if(myString.indexOf(pat) != -1){
            answer = 1;
        }
        return answer;
    }
}