class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean y1 = true;
        boolean y2 = true;
        
        if(x1 == true || x2 == true){
            y1 = true;
        } else if(x1 == false || x2 == false){
            y1 = false;
        }
        
        if(x3 == true || x4 == true){
            y2 = true;
        } else if(x3 == false || x4 == false){
            y2 = false;
        }
        
        if(y1 == false || y2 == false){
            answer = false;
        }
        
        return answer;
    }
}