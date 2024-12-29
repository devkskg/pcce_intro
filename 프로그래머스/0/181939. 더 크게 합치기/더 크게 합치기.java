class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        int num1 = Integer.parseInt(sb.toString());
        sb.delete(0, sb.length());
        sb.append(b);
        sb.append(a);
        int num2 = Integer.parseInt(sb.toString());
        
        if(num1 > num2){
            answer = num1;
        } else if(num1 <= num2){
            answer = num2;
        }
        
        return answer;
    }
}