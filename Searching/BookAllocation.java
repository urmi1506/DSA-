package Searching;

import java.util.Arrays;

public class BookAllocation {
    
    public static int findPages(int[] arr, int k) {
        int n = arr.length;

        if (n < k) return -1;  
        
        int start = Arrays.stream(arr).max().getAsInt();  
        int end = Arrays.stream(arr).sum();  

        int res = -1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (isValid(arr, n, k, mid)) {
                res = mid; 
                end = mid - 1;  
            } else {
                start = mid + 1;  
            }
        }
        
        return res;
    }

    public static boolean isValid(int[] arr, int n, int k, int maxPgs) {
        int stud = 1;  
        int sum = 0;   
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];  
            
            if (sum > maxPgs) {
                stud++;  
                sum = arr[i];  
                
                if (stud > k) {
                    return false;
                }
            }
        }
        
        return true;  
    }

    public static void main(String[] args) {
        int[] books = {12, 34, 67, 90}; 
        int k = 2; 
        System.out.println( findPages(books, k)); 
    }
}
