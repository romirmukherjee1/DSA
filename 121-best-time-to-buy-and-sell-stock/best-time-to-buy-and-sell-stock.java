class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; //intitializing to infinity
        int maxProfit = 0; // initializing to 0 

        for (int price: prices){
            if (price < minPrice){
                minPrice = price;
            }
            else if (price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}