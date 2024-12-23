class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        int[] arr2 = new int[arr.length];
        
       
        
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i].equals("Z")){
                if(arr[i-1].charAt(0) == '-'){
                    arr[i] = arr[i-1].replace("-", "");
                } else{
                    arr[i] = "-" + arr[i-1];
                }
                
            }
            arr2[i] = Integer.parseInt(arr[i]);
            answer += arr2[i];
           
        }
        
        
        
        return answer;
    }
}