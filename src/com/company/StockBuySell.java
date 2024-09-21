package com.company;

public class StockBuySell {

//
//    Input:
//    N = 7
//    A[] = {100,180,260,310,40,535,695}
//    Output:
//            1
//    Explanation:
//    One possible solution is (0 3) (4 6)
//    We can buy stock on day 0,
//    and sell it on 3rd day, which will
//    give us maximum profit. Now, we buy
//    stock on day 4 and sell it on day 6.

   static int a[] = {7,1,5,3,6,4};

    public static void main(String[] args) {

//        int minPricesSoFar = a[0];
//        int maxPrices = 0;
//        for(int i=1;i<=a.length-1;i++){
//            maxPrices = Math.max(maxPrices,a[i]-minPricesSoFar);
//            minPricesSoFar = Math.min(minPricesSoFar,a[i]);
//        }
//        System.out.println(maxPrices);
        check(a);
    }


    public static int check(int[] prices){
        int n = prices.length;
        int maxProfit =0;
        int max = prices[n-1];
        int profit =0;
        for(int i=n-2; i>=0; i--){
            if(prices[i]>max) {
                max = prices[i];
            }
            profit = max-prices[i];
            if(profit>maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

}

