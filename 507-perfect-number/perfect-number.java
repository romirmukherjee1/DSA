class Solution {
    public boolean checkPerfectNumber(int num) {
        int sumOfDiv = 0;
        if (num <= 0) return false; 
        for (int i = 1; i < num; i ++){
            if (num % i == 0){
                sumOfDiv = sumOfDiv + i;
            }
        }
        if (sumOfDiv == num) return true;
        else return false;
    }
}