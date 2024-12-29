import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";

        String str = polynomial.replace(" ", "");

        List<String> list = new ArrayList<String>(Arrays.asList(str.split("\\+")));
        
        // for(String l : list){
        //     System.out.println(l);
        // }
        
        
        int xNum = 0;
        int iNum = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals("x")){
                xNum++;
            } else if(list.get(i).indexOf("x") != -1){
                String temp = "";
                temp = list.get(i).substring(0, list.get(i).indexOf("x"));
                xNum += Integer.valueOf(temp);
            } else if(list.get(i).indexOf("x") == -1){
                String temp = "";
                temp = list.get(i);
                iNum += Integer.valueOf(temp);
            }
        }
        
        if(iNum == 0){
            if(xNum == 1){
                answer = "x";
            } else{
                answer = String.valueOf(xNum) + "x";
            }
        } else if(xNum == 0){
            answer = String.valueOf(iNum);
        } else{
            if(xNum == 1){
                answer = "x + " + String.valueOf(iNum);
            } else{
                answer = String.valueOf(xNum) + "x + " + String.valueOf(iNum);
            }
        }
        
        return answer;
    }
}