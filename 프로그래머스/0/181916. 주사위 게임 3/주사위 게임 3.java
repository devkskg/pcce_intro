import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        Collections.sort(list);
        
        if(a == b && b == c && c == d && a == d){
            answer = 1111 * a;
        } else if(a == b && b == c){
            answer = (int)Math.pow((10 * a + d), 2);
        } else if(a == b && b == d){
            answer = (int)Math.pow((10 * a + c), 2);
        } else if(a == c && c == d){
            answer = (int)Math.pow((10 * a + b), 2);
        } else if(b == c && c == d){
            answer = (int)Math.pow((10 * b + a), 2);
        } else if(a == b && c == d){
            if(a > c){
                answer = (a + c) * (int)Math.abs(a - c);
            } else {
                answer = (c + a) * (int)Math.abs(c - a);
            }
        } else if(a == c && b == d){
            if(a > b){
                answer = (a + b) * (int)Math.abs(a - b);
            } else {
                answer = (b + a) * (int)Math.abs(b - c);
            }
        } else if(a == d && b == c){
            if(a > b){
                answer = (a + b) * (int)Math.abs(a - b);
            } else {
                answer = (b + a) * (int)Math.abs(b - a);
            }
        } else if(a == b){
            answer = c * d;
        } else if(a == c){
            answer = b * d;
        } else if(a == d){
            answer = b * c;
        } else if(b == c){
            answer = a * d;
        } else if(b == d){
            answer = a * c;
        } else if(c == d){
            answer = a * b;
        } else if(a != b && b != c && c != d && a != d){
            answer = list.get(0);
        }
        
        
        
        
        return answer;
    }
}