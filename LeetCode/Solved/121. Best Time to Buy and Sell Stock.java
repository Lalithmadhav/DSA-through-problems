class Solution {
    public static int maxProfit(int[] prices) {
        int profit = 0, minprice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++) {
            if (minprice>prices[i]) {
                minprice = prices[i];
            }else profit = Math.max(profit, prices[i]-minprice);
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
    }
}
