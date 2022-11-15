public class Interval implements Comparable<Interval> {
    int x;
    int y;

    public Interval(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Interval o) {
        return this.x - o.x;
    }
}
