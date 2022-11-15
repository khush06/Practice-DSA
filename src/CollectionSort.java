import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort{
    public static void main(String[] args) {
        //Collections.sort
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(6);
        al.add(12);
        al.add(0);
        al.add(3);
        al.add(5);
        /*ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(1,"Ak"));
        al.add(new Student(8,"BK"));
        al.add(new Student(2,"CK"));
        al.add(new Student(10,"BK"));
        al.add(new Student(4,"qK")); */

        //Collections.sort
        System.out.println("Unsorted");
        for(Integer i:al)
            System.out.println(i);
        /*for(Student element:al){
            System.out.println(element);
        }
        //Ascending
        //Collections.sort(al,new SortById());
        //Descending
        Collections.sort(al,Collections.reverseOrder(new SortById()));
        System.out.println("Sorted in desending");
        for(Integer element:al){
            System.out.println(element);
        }*/

        //Collections.binarySearch in User-defined arrayList
        //int index = Collections.binarySearch(al,new Student(10,null),new SortById());

        //Collections.binarySearch in Integer ArrayList
        Collections.sort(al,Collections.reverseOrder());
        for(Integer element:al){
            System.out.println(element);
        }
        //TO find an element in descending array
        int index= Collections.binarySearch(al,6,Collections.reverseOrder());

        //TO find an element in ascending array
        //int index = Collections.binarySearch(al,5);
        System.out.println(index);



    }
}