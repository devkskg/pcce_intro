class Solution {
    public int solution(int[] numbers, int k) {
        
        int i = (2*(k - 1)) % (numbers.length);
        int answer = numbers[i];
        
        return answer;
    }
}