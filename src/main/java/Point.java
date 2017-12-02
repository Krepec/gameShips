import java.util.Comparator;
import java.util.Objects;
/**
 * Created by laptop on 24.11.17.
 */
public class Point implements Comparator {

    private int x;
    private int y;

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj){
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }
    @Override
    public String toString() {
        return "Point(" + x +"," + y +")";
    }

}

