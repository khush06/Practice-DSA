import java.util.Arrays;

//Use of Arrays.sort -- Not keeps stability, uses quicksort with 2 pivots
public class ArraysSort {
    public static void main(String[] args){
        //int[] arr = {7,1,5,67,44,23,45,77,12};
        //Integer[] arr = {7,1,5,67,44,23,45,77,12};
        Student[] arr = {new Student(5,"a"),new Student(3,"b"),new Student(5,"x"), new Student(56,"c"),
        new Student(34,"d"),new Student(5,"y")};
        Arrays.sort(arr); //fromIndex included, toindex excluded
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
