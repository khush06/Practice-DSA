public class MergeSort {
    public static void main(String[] args) {
        //Merge Sort
        //Takes O(nlogn) time
        //takes O(n) auxillary space -- hence not in-place. Variations of merge sort - block merge sort is in place with O(1) space
        //Stable
        //Uses divide n conquer
        //Used in external sorting
        //Quicksort works better for arrays than mergesort
        //Well suited for LL, works in O(1) space
        int[] arr={6,2,4,65,55,12,9,45,12,0};
        int low = 0, high = arr.length-1;
        mergeSort(arr,low,high);
        for(int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }

    }

    public static void mergeSort(int[] arr,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    //merging two sorted arrays
    //Theta(n)
    public static void merge(int[] arr,int low,int mid,int high){
        int temp1[] = new int[mid - low +1]; // As an array need not begin with 0, subarrays are also passed in this
        int temp2[] = new int[high-mid];
        for(int i=0;i< temp1.length;i++) temp1[i]=arr[low+i];
        for(int j=0;j<temp2.length;j++) temp2[j]=arr[mid+1+j];
        int i=0,j=0,k=low;
        while(i<temp1.length && j<temp2.length){
            if(temp1[i]<=temp2[j]){
                arr[k]=temp1[i];
                i++; k++;
            }
            else{
                arr[k]=temp2[j];
                j++; k++;
            }
        }
        while(i< temp1.length){
            arr[k]=temp1[i];
            i++; k++;
        }

        while(j< temp2.length){
            arr[k]=temp2[j];
            j++; k++;
        }
    }
}
