class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String temp = "";
        String num = "";
        
        for(int i = 0; i < numbers.length(); i++){
            if('a' <= numbers.charAt(i) && numbers.charAt(i) <= 'z'){
                temp += numbers.charAt(i);
            }
            
                if(temp.equals("one")){
                    num += "1";
                    temp = "";
                } else if(temp.equals("two")){
                    num += "2";
                    temp = "";
                } else if(temp.equals("three")){
                    num += "3";
                    temp = "";
                } else if(temp.equals("four")){
                    num += "4";
                    temp = "";
                } else if(temp.equals("five")){
                    num += "5";
                    temp = "";
                } else if(temp.equals("six")){
                    num += "6";
                    temp = "";
                } else if(temp.equals("seven")){
                    num += "7";
                    temp = "";
                } else if(temp.equals("eight")){
                    num += "8";
                    temp = "";
                } else if(temp.equals("nine")){
                    num += "9";
                    temp = "";
                } else if(temp.equals("zero")){
                    num += "0";
                    temp = "";
                }
            
        }
        
        answer = Long.parseLong(num);
        
        return answer;
    }
}