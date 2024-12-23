class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kk = String.valueOf(k);
        StringBuilder sb = new StringBuilder();
        for(int l = i; l <= j; l++){
            sb.append(l);
        }
        
        String sbStr = sb.toString();
        
        for(int l = 0; l < sbStr.length(); l++){
            String temp = "";
            temp += sbStr.charAt(l);
            if(temp.equals(kk)){
                answer++;
            }
        }
        
        return answer;
    }
}