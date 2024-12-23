import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        List<Character> list1 = new ArrayList<Character>();
        for(int i = 0; i < before.length(); i++){
            list1.add(before.charAt(i));
        }
        List<Character> list2 = new ArrayList<Character>();
        for(int i = 0; i < after.length(); i++){
            list2.add(after.charAt(i));
        }
        Collections.sort(list1);
        Collections.sort(list2);
        int count = 0;
        for(int i = 0; i < list1.size(); i++){
            if(list1.get(i) == list2.get(i)){
                count++;
            }
        }
        if(count == list1.size()){
            answer = 1;
        } else{
            answer = 0;
        }
        
        
        return answer;
    }
}