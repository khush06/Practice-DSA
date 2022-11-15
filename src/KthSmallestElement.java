import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
        //Naive approach
        //Sort the array and return (k-1)th element
        int[] arr = {43,45,6,4,12,18,98,43,72};
        int k = 7;
        //Arrays.sort(arr);
        //
        //  System.out.println(arr[k-1]);

        //By using partition method of quicksort
        int kthElementIndex = findKByPartition(arr,k,0,arr.length-1);
        if(kthElementIndex == -1)
            System.out.println("Not available");
        else
        System.out.println(arr[kthElementIndex]);
    }

    public static int findKByPartition(int[] arr,int k, int low, int high){
        while(low<=high){
            int p = partition(arr,low,high);
            if(p == k-1)
                return p;
            else if(p>(k-1))
                high=p-1;
            else if (p<(k-1)) {
                low = p+1;
            }
        }
        return -1;
    }

    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }
}
