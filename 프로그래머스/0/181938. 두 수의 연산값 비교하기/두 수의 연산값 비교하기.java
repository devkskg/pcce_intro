class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        int num1 = Integer.parseInt(sb.toString());
        
        int num2 = 2 * a * b;
        
        if(num1 > num2){
            answer = num1;
        } else if(num1 <= num2){
            answer = num2;
        }
        return answer;
    }
}