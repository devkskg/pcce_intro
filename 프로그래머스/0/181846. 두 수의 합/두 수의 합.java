import java.math.*;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        // BigInt a1 = BigInt.parseBigInt(a);
        // Bigint b1 = Bigint.parseBigint(b);
        // Bigint sum1 = a1+b1;
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);
        BigInteger sum1 = a1.add(b1);
        answer = String.valueOf(sum1);
        return answer;
    }
}