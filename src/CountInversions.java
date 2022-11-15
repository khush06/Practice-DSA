public class CountInversions {
    public static void main(String[] args) {
        int arr[] = {2,5,8,11,3,6,9,13};
        //Naive approach
       /* for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }*/
        System.out.println(mergeSort(arr,0,arr.length-1));
    }

    public static int mergeSort(int[] arr,int low,int high) {
        int res=0;
        if(low<high){
            int mid = (low+high)/2;
            res=res+mergeSort(arr,low,mid);
            res=res+mergeSort(arr,mid+1,high);
            res=res+merge(arr,low,mid,high);
        }
return res;
    }

    public static int merge(int[] arr,int low,int mid,int high) {
        int[] a = new int[mid-low+1];
        int[] b = new int[high-mid];
        for(int i=0;i<a.length;i++) a[i]=arr[low+i];
        for(int i=0;i<b.length;i++) b[i]=arr[mid+i+1];
        int i=0,j=0,k=low,res=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                i++;k++;
            }
            else {
                arr[k]=b[j];
                j++;k++;
                res=res+(a.length-i);
            }
            }
        while(i<a.length)
        {
            arr[k]=a[i];
            i++;k++;
        }
        while(j< b.length){
            arr[k]=b[j];
            j++;k++;
        }
        return res;
    }
}
