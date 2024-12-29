class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] ayaya = {"aya", "ye", "woo", "ma"};
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < ayaya.length; j++){
                // if(babbling[i].indexOf(ayaya[j]) == 0 && babbling[i].){
                    babbling[i] = babbling[i].replace(ayaya[j], " ");
                // }
                
            }
        }
        
        for(String bab : babbling){
            System.out.print(bab + ", ");
        }
        
        for(int i = 0; i < babbling.length; i++){
            if(babbling[i].equals(" ") || babbling[i].equals("  ") || babbling[i].equals("   ") || babbling[i].equals("    ")){
                answer++;
            }
        }
       
        
        
        
        return answer;
    }
}