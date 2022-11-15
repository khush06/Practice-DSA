public class InsertionSort {
    public static void main(String[] args){
        //Insertion sort
        //O(n2) TC, best case is O(n) when array is sorted
        // inplace and stable
        // used when arrays are small sized
        //used in Timsort(Python) and introSort when multiple sorting algos are used
        // Timsort uses merge sort when array is big, insertion sort when array becomes small

        int[] arr = {22,45,1,55,32,65,2,5,89};  // 22 45 1  key = 2, i=2 j=1, key=1  //22 1 45 key = 0 // 1 22 45
        for(int i = 1;i<arr.length;i++){
            int key = arr[i]; int j = i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
