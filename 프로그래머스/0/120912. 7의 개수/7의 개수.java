
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int a : array){
            sb.append(a);
        }
        
        String str = sb.toString();
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '7'){
                answer++;
            }
        }
        
        return answer;
    }
}