import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr1 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
        
        // int cnt = 0;
        
        
        
        for(int i = 0; i < 100; i++){
            int[] arr2 = new int[arr1.length];
            
            for(int j = 0; j < arr1.length; j++){
                arr2[j] = arr1[j];
            }
            
            
            
            for(int j = 0; j < arr1.length; j++){
                if(arr1[j] >= 50 && arr1[j] % 2 == 0){
                    arr1[j] /= 2;
                } else if(arr1[j] < 50 && arr1[j] % 2 == 1){
                    arr1[j] = arr1[j] * 2 + 1;
                }
            }
            // if(i % 2 == 0){
            //     for(int j = 0; j < arr1.length; j++){
            //         if(arr1[j] >= 50 && arr1[j] % 2 == 0){
            //             arr2[j] = arr1[j] / 2;
            //         } else if(arr1[j] < 50 && arr1[j] % 2 == 1){
            //             arr2[j] = arr1[j] * 2 + 1;
            //         }
            //     }
            // } else if(i % 2 == 1){
            //     for(int j = 0; j < arr2.length; j++){
            //         if(arr2[j] >= 50 && arr2[j] % 2 == 0){
            //             arr1[j] = arr2[j] / 2;
            //         } else if(arr2[j] < 50 && arr2[j] % 2 == 1){
            //             arr1[j] = arr2[j] * 2 + 1;
            //         }
            //     }
            // }
            if(Arrays.equals(arr1, arr2)){
                answer = i;
                break;
            }
            
            
        }
        return answer;
    }
}