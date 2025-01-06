class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        String d1 = "";
        String d2 = "";
        
        for(int i = 0; i < date1.length; i++){
            d1 += date1[i];
        }
        for(int i = 0; i < date2.length; i++){
            d2 += date2[i];
        }
        if(Integer.parseInt(d1) < Integer.parseInt(d2)){
            answer = 1;
        }
        return answer;
    }
}