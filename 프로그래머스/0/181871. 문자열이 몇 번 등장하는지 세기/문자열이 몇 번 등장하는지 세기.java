class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        // int d = pat.length() -1;
        // int start = myString.indexOf(pat);
        // myString = myString.substring(start, myString.length());
        // System.out.println(myString);
        // i < myString.length() - pat.length()+3
        for(int i = 0; ; i++){
            if(myString.indexOf(pat) == 0){
                answer++;
            }
            myString = myString.substring(1, myString.length());
            // System.out.println(myString);
            if(pat.length() > myString.length()){
                break;
            }
        }
        
        return answer;
    }
}