class Solution {
    public int solution(String[] spell, String[] dic) {
            int answer = 2;
            int result = 0;
            String spellStr = "";
            int[] count = new int[26];
            for(String s : spell){
                spellStr += s;
            }

            for(int i = 0; i < dic.length; i++){
                for(int j = 0; j < dic[i].length(); j++){
                    for(int k = 0; k < spellStr.length(); k++){
                        if(dic[i].charAt(j) == spellStr.charAt(k) && spell.length == dic[i].length()){
                            count[(int)(spellStr.charAt(k)-'a')]++;
                        }
                    }
                }
                for(int l = 0; l < count.length; l++){
                    if(count[l] > 0){
                        result++;
                    }
                }
            if(result == spell.length){
                answer = 1;
                break;
            } else{
                for(int m = 0; m < count.length; m++){
                    count[m] = 0;
                }
                result = 0;
            }



            }


            return answer;
    }
}