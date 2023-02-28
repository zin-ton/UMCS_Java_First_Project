import java.lang.Math;
public class Segment {
    private Point point1, point2;
    /*
    Public Point(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }
     */
    public void setPoints(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }
    public void length(){
        System.out.println(Math.sqrt(Math.pow(point1.x-point2.x,2)+Math.pow(point1.y-point2.y,2)));
    }
    public void print_points(){
        System.out.println(point1.x);
        System.out.println(point1.y);
        System.out.println(point2.x);
        System.out.println(point2.y);
    }
}
