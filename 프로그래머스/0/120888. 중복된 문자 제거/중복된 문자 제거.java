class Solution {
    public String solution(String my_string) {
        String answer = "";
        int count = 0;
        
        
        for(int i = 0; i < my_string.length(); i++){
            // if(i == 0){
            //     answer += my_string.charAt(0);
            // }
            
            for(int j = 0; j < answer.length(); j++){
                if(answer.charAt(j) == my_string.charAt(i)){
                    count++;
                    break;
                }
            }
            if(count == 0){
                answer += my_string.charAt(i);
            }
            count = 0;
            
            
            
        }
        
        
        return answer;
    }
}