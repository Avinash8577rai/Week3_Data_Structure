package day2.stackandqueue.stockspanproblem;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = StockSpan.calculateSpan(prices);


        System.out.println("Stock Prices: " + Arrays.toString(prices));
        System.out.println("Stock Spans:  " + Arrays.toString(spans));
    }

}
