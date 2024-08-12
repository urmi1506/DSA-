public class SumMiddEle {
  
        public static int SumofMiddleElements(int[] arr1, int[] arr2) {
        // 2.Sum of middle ele of array  
            int[] mergedArray = merge(arr1, arr2);
            
            int mid1 = mergedArray[mergedArray.length / 2 - 1];
            int mid2 = mergedArray[mergedArray.length / 2];
            return mid1 + mid2;
        }
        //1. Merge Both array
        private static int[] merge(int[] arr1, int[] arr2) {
            int m = arr1.length;
            int n = arr2.length;
            int i = 0, j = 0, k = 0;
            int[] mergedArray = new int[m + n];
    
            while (i < m && j < n) {
                if (arr1[i] < arr2[j]) {
                    mergedArray[k++] = arr1[i++];
                } else {
                    mergedArray[k++] = arr2[j++];
                }
            }
    
            while (i < m) {
                mergedArray[k++] = arr1[i++];
            }
    
            while (j < n) {
                mergedArray[k++] = arr2[j++];
            }
            
            return mergedArray;
        }
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 4, 6, 10};
            int[] arr2 = {4, 5, 6, 9, 12};
            int res=SumofMiddleElements(arr1, arr2) ;
            System.out.println(res);
        }
    }
    