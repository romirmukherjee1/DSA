class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int j = a.length() - 1;
        int k = b.length() - 1; 
        int carry = 0; 
        String res = null; 

        while(j >= 0 || k >= 0) {
            int sum = carry; 
            if (j >= 0) sum += a.charAt(j) - '0';
            if (k >= 0) sum += b.charAt(k) - '0';
            sb.append(sum % 2);
            carry = sum / 2; 

            j--;
            k--;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}