import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        Interval[] arr = {new Interval(5,10),
                            new Interval(3,15),
                            new Interval(18,30),
                            new Interval(2,7)};
        merge(arr);
    }

    //O(nlogn)
    public static void merge(Interval[] arr){
        Arrays.sort(arr);
        int res = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i].x >= arr[res].x && arr[i].x <= arr[res].y){
                arr[res].x = Math.min(arr[i].x,arr[res].x);
                arr[res].y = Math.max(arr[i].y,arr[res].y);
            }
            else{
                res++;
                arr[res] =arr[i];
            }
        }
        for(int i = 0;i<=res;i++){
            System.out.println(arr[i].x + " "+ arr[i].y);
        }
    }
}
