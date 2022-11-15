import java.util.Random;

public class QuickSort {
    //Divide and conquer
    // Worst case is O(n2)
    // Despite this, its considered faster cz -
    //In Place -- no extra memory needed
    //Cache friendly
    //Average is O(nlogn)
    //Tail Recursive
    //Used when stability is not required
    //Partition function is stable only with naive approach using 2 loops -- O(n2) and O(n)
    //Not stable with faster implementations - lomuto and hoarse partition -- O(nlogn) and O(1)
    //Best case - T(n)=2T(n/2)+THeta(n) -- O(nlogn) -- when array pivot is at the middle having all less at left and all greatr at right
    //Worst case - T(n)=T(n-1)+Theta(n) -- O(n2) -- when array pivot is at a position where it can divide the array in 1--(n-1)
    //means left contains only one  element, right contains all others or vice versa
    //When array is sorted, using Lomuto or Hoarse will go to worst case, as pivot will be last or first element
    //respectively. To avoid this, use random function to generate pivot in both partition methods
    public static void main(String[] args) {
        int[] arr = {33,6,8,1,5,14,23,50,42};
        qsort(arr,0,arr.length-1);
        for(int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
    }

    public static void qsort(int[]arr, int low,int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            qsort(arr, low, pivot - 1);
            qsort(arr, pivot + 1, high);
        }
    }

        //Lomuto partition
        //have less no of comparisons than lomuto
        //Works better than lomuto in averge case
        public static int partition(int[] arr,int low,int high){
        //Can lead to worst case if array is sorted
            //int pivot = arr[high];
        //Use random function to generate pivot
            int pivot = generateRandomPivot(arr,low,high);
            int i = low-1;
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

    //Hoarse Partition
    public static int hoarsePartition(int[] arr, int l,int h){
        int pivot = arr[l];
        int i = l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[i]>pivot);
            if(i>=j) return j;
            //swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    public static int generateRandomPivot(int[] arr,int low,int high){
        Random r = new Random();
        int pivotIndex = r.nextInt(high-low)+low;

        //Switching last element with random pivot
        int temp1 = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high]=temp1;

        return arr[high];
    }

}
