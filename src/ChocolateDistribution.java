import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        //Distribute chocolates in such a way that it is fair, i.e. diff between min and max chocolates should be min
        int[] arr = {3,4,1,9,56,7,9,12}; //No of chocolates in diff packs 2,3,4,7,9,12,56
        int c = 5; //No of children
        int res = Integer.MAX_VALUE;
        if(arr.length<c)
            System.out.println("Not possible");
        else{
        Arrays.sort(arr);
        for(int i=c-1;i<arr.length;i++){
              int temp = Math.abs(arr[i]-arr[i-(c-1)]);
              res = Math.min(res,temp);
            }
            System.out.println(res);
        }
    }
}
