import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<String>();
        
        for(int i = 0; i < picture.length; i++){
            String temp = "";
            for(int j = 0; j < picture[i].length(); j++){
                for(int m = 0; m < k; m++){
                    temp += picture[i].charAt(j);
                }
            }
            for(int j = 0; j < k; j++){
                list.add(temp);
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}