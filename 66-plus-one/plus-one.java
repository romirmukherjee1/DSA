class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i>= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  //increment one's place
                return digits;        
            }
            // edge case [9,9,9] scenario
            digits[i] = 0; //set all digits to 0
        }
        int[] new_num = new int[digits.length + 1]; //increasing array length
        new_num[0] = 1; // set MSD to 1 for edge case
        return new_num;
    }
}