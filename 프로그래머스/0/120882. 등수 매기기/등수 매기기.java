class Solution {
    public int[] solution(int[][] score) {
        int[] avg = new int[score.length];
        int[] answer = new int[avg.length];
        // int count = 1;
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = 1;
        }
        
        
        // for(int i = 0; i < avg.length; i++){
        //     avg[i] = (score[i][0] + score[i][1])/2;
        // }
        for(int i = 0; i < score.length; i++){
            int sum = 0;
            for(int j = 0; j < score[i].length; j++){
                sum += score[i][j];
            }
            // avg[i] = sum / score[i].length;
            avg[i] = sum;
        }
        
        for(int i = 0; i < avg.length; i++){
            for(int j = 0; j < avg.length; j++){
                // if(i == j){
                //     continue;
                // }
                if(avg[i] < avg[j]){
                    answer[i]++; 
                }
            }
        }
        
        // for(int a : avg){
        //     System.out.print(a + " ");
        // }
        // System.out.println();
        return answer;
    }
}