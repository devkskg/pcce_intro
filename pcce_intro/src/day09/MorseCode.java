package day09;

public class MorseCode {
	
	public String method(String letter) {
		
		String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f','--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l','--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r','...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x','-.--':'y','--..':'z'";
		
		String answer = "";
		morse = morse.replace("'", "");
		morse = morse.replace(":", "");
		String[] morseArr = morse.split(",");
//		System.out.println(morseArr[15]);
//		for(String mor : morseArr) {
//			System.out.println(mor);
//		}
		String[] arr = letter.split(" ");
//		System.out.println(arr[0]);
//		for(String a : arr) {
//			System.out.println(a);
//		}
		
		
//		morseArr.charAt(arr[i].size()) -> 영어
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < morseArr.length; j++) {
				if(morseArr[j].length() == arr[i].length()+1) {
					if(morseArr[j].substring(0, morseArr[j].length()-1).equals(arr[i])) {
						answer += morseArr[j].charAt(morseArr[j].length()-1);
					}
					
					
					
					
				}
				
				
				
			}
		}
		
		
		
		
		return answer;
	}
			
			
}
