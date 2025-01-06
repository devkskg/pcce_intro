class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String temp1 = myString.replace("A", "C");
        temp1 = temp1.replace("B", "A");
        temp1 = temp1.replace("C", "B");
        
        if(temp1.indexOf(pat) != -1){
            answer = 1;
        }
        
        return answer;
    }
}