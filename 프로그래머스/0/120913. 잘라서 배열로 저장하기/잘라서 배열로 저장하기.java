class Solution {
    public String[] solution(String my_str, int n) {
        int l = 0;
        if(my_str.length() % n == 0){
            l = my_str.length() / n;
        } else if(my_str.length() % n != 0){
            l = my_str.length() / n + 1;
        }
        String[] answer = new String[l];
        String sum = "";
        int cnt = 0;
        
        for(int i = 0; i < my_str.length(); i++){
            sum += my_str.charAt(i);
            if(i % n == n - 1){
                answer[cnt] = sum;
                sum = "";
                cnt++;
            } else if(i == my_str.length() - 1){
                answer[cnt] = sum;
              
            }
        }
        
        
        return answer;
    }
}