import java.util.Comparator;

public class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    public String toString(){
        return this.id+" "+this.name;
    }


    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}

class SortById implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.id - o2.id;
    }
}

