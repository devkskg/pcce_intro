import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] rank = new int[numlist.length];
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        // List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(numlist));
        
        for(int i = 0; i < numlist.length; i++){
            list1.add(Math.abs(numlist[i] - n));
        }
        
        for(int i = 0; i < list1.size(); i++){
            for(int j = 0; j < list1.size(); j++){
                if(list1.get(i) > list1.get(j)){
                    rank[i]++;
                }
            }
        }
        
        for(int i = 0; i < rank.length; i++){
            list2.add(rank[i]);
        }
        
        
        for(int l : list1){
            System.out.print(l + " ");
        }
        System.out.println(" 절대값");
        for(int r : rank){
            System.out.print(r + " ");
        }
        System.out.println(" 랭크");
//         list1 절대값
//         list2 rank복사
//         list3 결과
        for(int i = 0; ; i++){
            if(list2.indexOf(i) != list2.lastIndexOf(i) && list2.indexOf(i) != -1){
                list3.add(list1.get(list2.indexOf(i)) + n);
                list3.add(-list1.get(list2.indexOf(i)) + n);
            } else if(list2.indexOf(i) == list2.lastIndexOf(i) && list2.indexOf(i) != -1){
                list3.add(numlist[list2.indexOf(i)]);
            }
            if(numlist.length == list3.size()){
                break;
            }
        }
        
        // for(int i = 0; i < list1.size(); i++){
        //     if(rank[i] == 0){
        //         answer[0] = list.get(i);
        //     } else if(rank[])
        // }
        
        // arrayList.toArray(array);
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list3.get(i);
        }
        
        
        
        
        
        return answer;
    }
}