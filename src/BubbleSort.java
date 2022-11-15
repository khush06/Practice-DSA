public class BubbleSort {

    public static void main(String[] args){
        //Bubble Sort
        //compares adjacent elements, swaps if a[j]>a[j+1] meanwhile taking largest element at the end
        //O(n2)
        //Stable -- never swaps if 2 elements are same
        //Inplace algo - does not need extra temp memory
        int[] arr = {10,4,2,56,32,55,12,6};
        for(int i = 0;i<arr.length-1;i++)
        {
            boolean swapped = false; //Makes best case O(n) -- when array is sorted
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
