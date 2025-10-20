package Easy;

// TC : O(N) SC: O(1)
public class BuySell {
    public static int maxProfit(int[] prices) {
        // sell price must always come after buy price (hence not update sell otherwise its not match above cond)
        int n=prices.length;
        // buy ...when value is smallest
        int buy=prices[0];
        // profit
        int profit=0;
        
        for(int i=1; i<n; i++){
            if(prices[i]<buy) buy=prices[i];
            profit=Math.max(profit,prices[i]-buy);
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
