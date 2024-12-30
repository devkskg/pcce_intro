class Solution {
    public String solution(String code) {
        String answer = "";
        int mod = 0;
        for(int i = 0; i < code.length(); i++){
            
            if(code.charAt(i) == '1'){
                mod++;
                continue;
            } else if(mod % 2 == 0 && i % 2 == 0){
                answer += code.charAt(i);
            } else if(mod % 2 == 1 && i % 2 == 1){
                answer += code.charAt(i);
            }
            
        }
        
        if(answer.length() == 0){
            answer = "EMPTY";
        }
        
        
        
        
        
        
        return answer;
    }
}