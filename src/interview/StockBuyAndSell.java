package interview;

public class StockBuyAndSell {

    //on which day selling the stock will give max profit;
    public static  int maxProfit(int [] Y){
        int n = Y.length;
        int profit =0;
        int maxProfit = 0;
        int max = Y[n-1];
        for(int i=n-2; i>=0; i--){

            //first we have to find the max
            if(Y[i] > max) {
                max = Y[i];
            }
            //find the profit
            profit = max - Y[i];
            // compare the profit with maxProfit
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
          int[] X = {7,1,5,3,6,4};
          maxProfit(X);
    }
}
