class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        
        if(board.length == 1){
            if(board[0][0] == 1){
                answer = 0;
            } else if(board[0][0] == 0){
                answer = 1;
            }
        } else{
            int[][] nb = new int[board.length+2][board[1].length+2];
            int[][] nb2 = new int[board.length+2][board[1].length+2];
            for(int i = 0; i < nb.length; i++){
                for(int j = 0; j < nb[i].length; j++){
                    nb[i][j] = 0;
                }
            }

            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board[i].length; j++){
                    nb[i+1][j+1] = board[i][j];
                    nb2[i+1][j+1] = board[i][j];
                }
            }

            for(int i = 1; i < nb.length-1; i++){
                for(int j = 1; j < nb[i].length-1; j++){
                    if(nb[i][j] == 1){
                        nb2[i-1][j-1] = -1;
                        nb2[i-1][j] = -1;
                        nb2[i][j-1] = -1;
                        nb2[i+1][j] = -1;
                        nb2[i][j+1] = -1;
                        nb2[i+1][j+1] = -1;
                        nb2[i-1][j+1] = -1;
                        nb2[i+1][j-1] = -1;
                    }
                }
            }

            // for(int i = 1; i < nb.length-1; i++){
            //     for(int j = 1; j < nb[i].length-1; j++){
            //         System.out.print(nb2[i][j] + " ");
            //     }
            // }


            int count = 0;
            for(int i = 1; i < nb2.length-1; i++){
                for(int j = 1; j < nb2[i].length-1; j++){
                   if(nb2[i][j] == 0){
                       count++;
                   }

                }
            }
            answer = count;

        }
        
        return answer;
    }
}