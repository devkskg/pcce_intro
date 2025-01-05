package day13;

public class StringReverse {

	public static void main(String[] args) {
		String my_string = "rermgorpsam";
		int[][] queries = {{2,3}, {0,7}, {5,9}, {6,10}};
		
		String answer = "";
        String temp = "";
        StringBuilder sb = new StringBuilder(my_string);
        System.out.println(sb);
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            
            for(int j = e; j >= s; j--){
                temp += (char)my_string.charAt(j);
            }
//            System.out.println(temp);
            System.out.println(temp);
            sb.delete(s, e+1);
            sb.insert(s, temp);
            System.out.println(sb);
            temp = "";
        }
        answer = sb.toString();
//        System.out.println(answer);

	}

}
