class Solution {
    public String solution(String bin1, String bin2) {
        // String answer = "";
        int c1 = 0;
		int c2 = 0;
		int count = 0;
		for (int i = bin1.length() - 1; i >= 0; i--) {
			c1 += (int) (bin1.charAt(i) - '0') * (int) Math.pow(2, count++);
		}
		count = 0;
		for (int i = bin2.length() - 1; i >= 0; i--) {
			c2 += (int) (bin2.charAt(i) - '0') * (int) Math.pow(2, count++);
		}
		count = 0;
		
		int decaSum = c1 + c2;
		
		// System.out.println(c1);
		// System.out.println(c2);
		// System.out.println(decaSum);
		
		while(true) {
			if((decaSum < Math.pow(2, count))) {
				count--;
				break;
			} else if(decaSum == Math.pow(2, count)){
				break;
			}else {
				count++;
			}
		}
		
		System.out.println(count);
		String str = "";
		
		if(decaSum == 0) {
			str += "0";
		} else {
			while(true) {
				if(decaSum >= (int)Math.pow(2, count)) {
					decaSum = decaSum - (int)Math.pow(2, count);
					count--;
					str += "1";
				} else {
					str += "0";
					count--;
				}
				if(count < 0) {
					break;
				}
			}
			
		}
		
		

//		System.out.println(decaSum);
//		System.out.println(count);
		// System.out.println("str" + str);
        return str;
    }
}