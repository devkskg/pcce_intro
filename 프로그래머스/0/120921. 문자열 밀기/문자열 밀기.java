class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int count = 0;
        String temp = "";
        StringBuilder sb = new StringBuilder(A);
        
        for(int i = 0; i < sb.length(); i++){
            temp = "";
            if(sb.toString().equals(B)){
                answer = count;
                break;
            }
            temp += sb.charAt(sb.length()-1);
            if(sb.length() != 0){
                sb.deleteCharAt(sb.length()-1);
            }
            sb.insert(0, temp);
            System.out.println(sb);
            count++;
            
            
        }
        
        
        
        
        return answer;
    }
}