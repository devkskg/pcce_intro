class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int temp = 1;
//         유클리드 호제법? GCD? 찾아보자
        
        for(int i = 2; i <= a && i <= b; i++){
            if(a % i == 0 && b % i == 0){
                temp = i;
            }
        }
        
        // int convA = a / temp;
        
        int convB = b / temp;
        // int convB = (int)Math.round(b / temp);
        
        while(true){
            if(convB % 2 == 0){
                convB /= 2;
            } else if(convB % 5 == 0){
                convB /= 5;
            } else if(convB == 1){
                answer = 1;
                break;
            } else{
                answer = 2;
                break;
            }
            
        }
        
        
        
        
        
        
        
//         temp = 1;
//         for(int i = convB; i > 1; i--){
//             if(convB % i == 0){
//                 temp = i;
//             }
//         }
        
//         if(temp == 1){
//             answer = 2;
//         } else if(temp == 2 || temp == 5){
//             answer = 1;
//         }
        
        // if(convB % 2 == 0 || convB % 5 == 0){
        //     answer = 1;
        // } else if(convB == 1 || b == 1){
        //     answer = 1;
        // }
        
        // for(int i = 1; i <= convB; i++){
        //     if(convB % i == 0){
        //         list.add(i)
        //     }
        // }
        
        
        
        
        
        return answer;
    }
}