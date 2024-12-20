package day05;

public class Solution01 {
	public int solution(int price) {
        int answer = 0;
        int dc = 0;
        if(price >= 500000){
            dc = 20;
        } else if(price >= 300000){
            dc = 10;
        } else if(price >= 100000){
            dc = 5;
        }
        return price * (100- dc) / 100;
    }
}
