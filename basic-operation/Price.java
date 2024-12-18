public class Price {
    public static int[] finalPrices(int[] prices) {
        int[] answer = new int[prices.length]; 
        
        for (int i = 0; i < prices.length; i++) {
            int discount = 0; 
            for (int j = i + 1; j < prices.length; j++) { 
                if (prices[j] <= prices[i]) {
                    discount = prices[j]; 
                    break; 
                }
            }
            answer[i] = prices[i] - discount; 
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        int[] res = finalPrices(prices); 
        for (int price : res) { 
            System.out.print(price + " ");
        }
    }
}
