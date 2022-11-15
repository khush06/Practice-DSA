import java.util.Arrays;

public class MinimumDifference {
    public static void main(String[] args) {
        int[] arr = {6,19,45,21,67,90,98,64};
        //Naive approach - traverse the array for all the elements and calculate min
        //Efficient - Sort the array and find the diff of adjacent elements
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            res = Math.min(res,Math.abs(arr[i]-arr[i+1]));
        }
        System.out.println(res);
    }
}
