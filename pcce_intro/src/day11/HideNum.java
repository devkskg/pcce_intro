package day11;

public class HideNum {

	public static void main(String[] args) {
		String my_string = "sf23fwfsdf2";
		int answer = 0;
		String str = "0";
		for (int i = 0; i < my_string.length(); i++) {
			if ('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {

				str += my_string.charAt(i);

			} else {
				answer += Integer.parseInt(str);
				str = "0";
			}

		}
		answer += Integer.parseInt(str);

		System.out.println(answer);
	}

}
