package Greedy;
import java.util.*;

public class FractionalKnapsack {

    static class Item {
        int value, weight;

        Item(int v, int w) {
            value = v;
            weight = w;
        }
    }

    public static double fractionalKnapsack(int[] val, int[] wt, int W) {

        int n = val.length;
        Item[] arr = new Item[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Item(val[i], wt[i]);
        }

        // Sort based on value/weight ratio (descending)
        Arrays.sort(arr, (a, b) -> 
            Double.compare((double)b.value / b.weight,
                           (double)a.value / a.weight)
        );

        double totalVal = 0.0;

        for (int i = 0; i < n; i++) {

            if (arr[i].weight <= W) {
                totalVal += arr[i].value;
                W -= arr[i].weight;
            } 
            else {
                totalVal += ((double)arr[i].value / arr[i].weight) * W;
                break;   
            }
        }

        return totalVal;
    }
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int capacity = 50;

        double res = fractionalKnapsack(val, wt, capacity);
        System.out.println(res);

    }
}

