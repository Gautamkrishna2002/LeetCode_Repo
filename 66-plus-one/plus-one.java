import java.math.BigInteger;
class Solution {
    public static int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }

        BigInteger number = new BigInteger(sb.toString());
        number = number.add(BigInteger.ONE);

        String resultStr = number.toString();
        int[] result = new int[resultStr.length()];
        for (int i = 0; i < resultStr.length(); i++) {
            result[i] = Character.getNumericValue(resultStr.charAt(i));
        }

        return result;
    
     }
}