class Solution {
    public int[] solution(String myString) {
        int[] answer = null;
        if(myString.substring(myString.length()-1, myString.length()).equals("x")){
            String[] arr = myString.split("x");
            answer = new int[arr.length+1];
            for(int i = 0; i < arr.length; i++){
                answer[i] = arr[i].length();
            }
        } else{
            String[] arr = myString.split("x");
        
            answer = new int[arr.length];

            for(int i = 0; i < arr.length; i++){
                answer[i] = arr[i].length();
            }
        }
        
        
        
        return answer;
    }
}