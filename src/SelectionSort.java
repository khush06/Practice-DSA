public class SelectionSort {
    public static void main(String[] args){

        //Selection Sort
        // Not Stable
        // In place algo
        // Uses less memory writes than merge, insertion, quicksort etc -- if memory is costly can use
        //selection sort, but the optimal sorting algo for lesser mem writes is cycle sort
        //Basic idea for heap sort -- uses same logic on heap data
        //O(n2)

        int[] arr = {5,34,22,1,6,54,12,34,78,0};
        for(int i = 0;i<arr.length; i++){
            int min = i;

            // TO find min element
            for(int j = i+1;j<arr.length;j++) {
                if (arr[j] < arr[min])
                    min = j;
                }
            //After finding min element, swap with first element
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
