public class TwoTypeElementsSort {
    public static void main(String[] args) {
        int[] arr = {5,7,9,2,1,88,11,54,4};
        lsort(arr);
        for(int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
    }

    //Hoarse partition method
    public static void sort(int[] arr)
    {
        int low = -1,high = arr.length;
        while(true){
        do{low++;}while
        (arr[low]<0);
        do{high--;}while
        (arr[high]>0);
        if(low>=high) return;
        int temp = arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }}

    public static void lsort(int[] arr){
        int i = -1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2 == 0){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
