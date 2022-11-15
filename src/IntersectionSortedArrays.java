public class IntersectionSortedArrays {
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,3,4,4,4,5,6,7};
        int[] arr2 = {0,3,3,4,4,4,5,9,10};
        merge(arr1,arr2);
    }

    public static void merge(int[] arr1,int[] arr2){
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            //if you dont wanna print duplicates
            /*if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }*/
            if(arr1[i]<arr2[j])
                i++;
            else if(arr2[j]<arr1[i])
                j++;
            else
            {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
    }
}
