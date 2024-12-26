class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        int xBoard = (board[0] - 1) / 2;
        int yBoard = (board[1] - 1) / 2;
        
        for(int i = 0; i < keyinput.length; i++){
            // if(Math.abs(x) == Math.abs(xBoard)){
            //     continue;
            // }
            // if(Math.abs(y) == Math.abs(yBoard)){
            //     continue;
            // }
            
            
            if(keyinput[i].equals("left")){
                if(x == -xBoard){
                continue;
            }
                x--;
            } else if(keyinput[i].equals("right")){
                if(x == xBoard){
                continue;
            }
                x++;
            } else if(keyinput[i].equals("up")){
                if(y == yBoard){
                continue;
            }
                y++;
            } else if(keyinput[i].equals("down")){
                if(y == -yBoard){
                continue;
            }
                y--;
            }
            
            
        }
        
        
        
        // if(Math.abs(x) > Math.abs(xBoard)){
        //     if(x < 0){
        //         x = -xBoard;
        //     } else if(x > 0){
        //         x = xBoard;
        //     }
        // }
        // if(Math.abs(y) > Math.abs(yBoard)){
        //     if(y < 0){
        //         y = -yBoard;
        //     } else if(y > 0){
        //         y = yBoard;
        //     }
        // }
        
        answer[0] = x;
        answer[1] = y;
        
        
        return answer;
    }
}