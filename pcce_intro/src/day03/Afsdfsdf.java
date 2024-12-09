package day03;

public class Afsdfsdf {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 3, 3, 4};
        int answer = 0;
        int count = 0;
        int k = 0;
        int s = 0;
        int x = 0;
//        최빈값 return
//        최빈값이 여러개면 -1
//        1 2 1 2 1 2 3 1 
//        1. 우선 정렬하기 해주고
//        배열들의 비교를 통해 같으면 count++해서
        
//        값을 새로운 배열에 저장. count 초기화
        int[] cArr = new int[99];

        
        
        int i = 0;
        int j = 0;
//        정렬하기
        for(i = 0; i < array.length -1; i++) {
        	for(j = i + 1; j < array.length; j++) {
        		if(array[i] > array[j]) {
        			int temp = array[i];
        			array[i] = array[j];
        			array[i] = temp;
        		}
        		
        	}
        }
//        정렬 완료
        
//        for(int ar : array) {
//        	System.out.println(ar);
//        }
        
        
//        이 부분만 다시 하면 될듯~!!!!!!!!
//      이 부분만 다시 하면 될듯~!!!!!!!!
//      이 부분만 다시 하면 될듯~!!!!!!!!
//      이 부분만 다시 하면 될듯~!!!!!!!!
//      이 부분만 다시 하면 될듯~!!!!!!!!
//      이 부분만 다시 하면 될듯~!!!!!!!!
//      이 부분만 다시 하면 될듯~!!!!!!!!
//      이 부분만 다시 하면 될듯~!!!!!!!!
//      이 부분만 다시 하면 될듯~!!!!!!!!
        while(true) {
        	for(i = k; i < array.length -1; i++) {
        		for(j = i + 1; j < array.length; j++) {
        			if(array[i] == array[j]) {
        				count++;
        			} else {
//        				s++;
        				k = array[j];
        			}
        		}
        		cArr[i] = count;
        		count = 0;
//        		if(s != 0) {
//        			break;
//        		}
        	}
//        	s = 0;
        	if(i == array.length -1) {
        		break;
        	}
        }
        
//        for(int car : cArr) {
//        	System.out.println(car);
//        }
        System.out.println("====");
//      이 부분만 다시 하면 될듯~!!!!!!!!
//    이 부분만 다시 하면 될듯~!!!!!!!!
//    이 부분만 다시 하면 될듯~!!!!!!!!
//    이 부분만 다시 하면 될듯~!!!!!!!!
//    이 부분만 다시 하면 될듯~!!!!!!!!
//    이 부분만 다시 하면 될듯~!!!!!!!!
//    이 부분만 다시 하면 될듯~!!!!!!!!
//    이 부분만 다시 하면 될듯~!!!!!!!!
//    이 부분만 다시 하면 될듯~!!!!!!!!
        
        int max = cArr[0];
        for(i = 0; i < cArr.length; i++) {
        	if(cArr[i] > max) {
        		max = cArr[i];
        		s = i;
        	}
        }
        
        answer = array[s];
        System.out.println(answer);
        
        
//        cArr 정렬
//        for(i = 0; i < cArr.length -1; i++) {
//        	for(j = i + 1; j < cArr.length; j++) {
//        		if(cArr[i] < cArr[j]) {
//        			int temp = cArr[i];
//        			cArr[i] = cArr[j];
//        			cArr[j] = temp;
//        		}
//        		
//        	}
//        }
//        
////        for(i = 0; i < 5; i++) {
////        	System.out.println(cArr[i]);
////        }
//        
//        if(cArr[0] == cArr[0+1]) {
//        	answer = -1;
//        } else {
//        	x = cArr[s];
//        	
//        	answer = x;
//        }
        
        
        
        
        
        
//        System.out.println(answer);
    }

}
