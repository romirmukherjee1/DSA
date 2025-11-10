class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || x !=0 && x % 10==0 ) return false; // excluding 0 and 10, multiples of 10
        int flag = 0;
        while (x > flag){
            flag = flag * 10 + x % 10;
            x /= 10;
        }
        return (x == flag || x == flag/ 10);
    }
}