import java.util.Comparator;

/**
 * Created by laptop on 27.11.17.
 */
public class PointComparator implements Comparator<Point>{
    @Override
    public int compare(Point pointXiY1, Point pointXiY2) {  // musimy zdefinowac w jaki sposób chcemy porównywać  0 =  równe, -1 = mnijsze, 1 wieksze
        if (pointXiY1.getX() > pointXiY2.getX()) {

            return 1;

        } else if (pointXiY1.getX() == pointXiY2.getX()) {
            if (pointXiY1.getY() == pointXiY2.getY()) {
                return 0;
            } else if (pointXiY1.getY() < pointXiY2.getY()) {
                return -1;
            } else {
                return 1;
            }
        } else {
                return -1;
        }
/*
        if (ob1 > obj2){
            return 1;
        }else if(obj1 == obj2){
            return 0;
        }else {
            return -1;
        }*/
        }
    }
