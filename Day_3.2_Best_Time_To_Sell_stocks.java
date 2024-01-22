class Solution {
    public int maxProfit(int[] prices) {
        int first = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < first){
                first = prices[i]; 
            }
            a = prices[i] - first;
            if(b < a){
                b = a; 
            }
        }
        return b;
    }
}
