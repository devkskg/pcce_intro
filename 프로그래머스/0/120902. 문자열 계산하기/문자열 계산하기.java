import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
		String str = "";
		List<Integer> list = new ArrayList<Integer>();


		for (int i = 0; i < my_string.length(); i++) {
			
			if ('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {

				str += String.valueOf(my_string.charAt(i) - '0');

				if (i == my_string.length() - 1) {
					list.add(Integer.parseInt(str));
					str = "";
				}

			} else if(str != "" && !str.equals("-")){
				list.add(Integer.parseInt(str));
				str = "";
			} else if (my_string.charAt(i) == '-') {
				str += "-";
			}
				

		}

		for (int l : list) {
			answer += l;
		}
        
        return answer;
    }
}