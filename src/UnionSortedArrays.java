public class UnionSortedArrays {
    public static void main(String[] args)
    {
        int[] arr1 = {2,3,3,3,4,4};
        int[] arr2 = {4,4};
        //prints every element in arr1 and arr2 exactly once
        merge(arr1,arr2);
    }

    public static void merge(int[] arr1,int[] arr2){
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){

            if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            if(j>0 && arr2[j]==arr2[j-1]){
                j++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                System.out.println(arr1[i]);
                i++;
            }
            else if(arr2[j]<arr1[i])
                j++;
            else
            {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }

        while(i<arr1.length)
        {
            if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            System.out.println(arr1[i]);
            i++;
        }

        while(j<arr2.length)
        {
            if(j>0 && arr2[j]==arr2[j-1]){
                j++;
                continue;
            }
            System.out.println(arr2[j]);
            j++;
        }
    }
}
