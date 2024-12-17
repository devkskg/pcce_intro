package day09;

public class Run {
	public static void main(String[] args) {
		
		String letter1 = ".... . .-.. .-.. ---";
		String letter2 = ".--. -.-- - .... --- -.";
		MorseCode m = new MorseCode();
		System.out.println(m.method(letter1));
		
		BallsShare bs = new BallsShare();
		System.out.println(bs.method(3, 2));
		
		int[] sides = {3, 6, 2};
		Triangle t = new Triangle();
		System.out.println(t.tri(sides));
		
		
	}
}
