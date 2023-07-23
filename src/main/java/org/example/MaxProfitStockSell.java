package org.example;

public class MaxProfitStockSell {

    public static void main(String[] args){
        System.out.println("Remove duplicate elements from Sorted Array and return count of array");
        int[] stockValues = {4,7,2,8,4,7,1,9,2,5};
        System.out.println("Max profit after selling stocks: " + maxProfit(stockValues));
    }

    private static int maxProfit(int[] stockValues) {
        int peak = stockValues[0];
        int valley = stockValues[0];
        int maxprofit = 0;
        int i = 0;
        while(i < stockValues.length - 1) {
            while (i < stockValues.length - 1 && stockValues[i] >= stockValues[i + 1]) {
                System.out.println("valley loop " + stockValues[i] + " " + stockValues[i + 1]);
                i++;
            }
            valley = stockValues[i];
            System.out.println("final valley " + valley);
            while (i < stockValues.length - 1 && stockValues[i] <= stockValues[i + 1]) {
                System.out.println("peak loop " + stockValues[i] + " " + stockValues[i + 1]);
                i++;
            }
            peak = stockValues[i];
            System.out.println("final peak " + peak);
            maxprofit += peak - valley;
            System.out.println("profit in iteration#" + i + " " + maxprofit);
        }
        return maxprofit;
    }

}
