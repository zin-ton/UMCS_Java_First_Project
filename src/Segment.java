import java.lang.Math;
public class Segment {
    private Point point1, point2;
    /*
    Public Point(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }
     */
    //   <line x1 = "point1.x" x2 = "point2.x" y1 = "point1.y" y2 = "point2.y" stroke = "red" stroke-width = "5"/>
    public void setPoints(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }
    public double length(){
        return Math.sqrt(Math.pow(point1.x-point2.x,2)+Math.pow(point1.y-point2.y,2));
    }
    public Point returnPoint1(){
        return this.point1;
    }
    public Point returnPoint2(){
        return this.point2;
    }
    public void print_points(){
        System.out.println(point1.x);
        System.out.println(point1.y);
        System.out.println(point2.x);
        System.out.println(point2.y);
    }
    public String toSvg(){
        String ans;
        ans = "<line x1 = ";
        ans += '"';
        ans += Math.min(point1.x, point2.x);
        ans += '"';
        ans += " x2 = ";
        ans += '"';
        ans += Math.max(point1.x, point2.x);
        ans += '"';
        ans += " y1 = ";
        ans += '"';
        ans += Math.min(point1.y, point2.y);
        ans += '"';
        ans += " y2 = ";
        ans += '"';
        ans += Math.max(point1.y, point2.y);
        ans += '"';
        ans += " stroke = ";
        ans += '"';
        ans += "red";
        ans += '"';
        ans += " stroke-width = ";
        ans += '"';
        ans += 5;
        ans += '"';
        ans+="/>";
        return ans;
    }
    public Segment paral(Segment segment, Point point){
        double size =  segment.length();
        Segment answer = new Segment();
        Point pointAns;
        double lx=0;
        double ly=0;
        Point point1 = segment.returnPoint1();
        Point point2 = segment.returnPoint2();
        int isUper = 0;
        double deltaY = point1.y - point2.y;
        double deltaX = point1.x - point2.x;
        deltaY/=deltaX;
        deltaX = point.x - point1.x;
        if(point.y >= (deltaY*deltaX)) isUper = 1;
        if((point1.y <= point2.y) && isUper == 1){
            deltaY = point1.y - point2.y;
            lx = point.x + deltaY;
            ly = (Math.sqrt(size*size-(point1.x-lx)*(point1.x-lx))-point.y)*-1;
            pointAns = new Point(lx, ly);
            answer.setPoints(point, pointAns);
            return answer;
        }
        if((point1.y <= point2.y) && isUper == 0){
            deltaY = point1.y - point2.y;
            lx = point.x - deltaY;
            ly = (Math.sqrt(size*size-(point1.x-lx)*(point1.x-lx))-point.y)*-1;
            pointAns = new Point(lx, ly);
            answer.setPoints(point, pointAns);
            return answer;
        }
        else{
            if((point1.y > point2.y) && isUper == 1){
                deltaY = point1.y - point2.y;
                lx = point.x - deltaY;
                ly = (Math.sqrt(size*size-(point1.x-lx)*(point1.x-lx))-point.y)*-1;
                pointAns = new Point(lx, ly);
                answer.setPoints(point, pointAns);
                return answer;
            }
            else{
                if((point1.y > point2.y) && isUper == 0){
                    deltaY = point1.y - point2.y;
                    lx = point.x + deltaY;
                    ly = (Math.sqrt(size*size-(point1.x-lx)*(point1.x-lx))-point.y)*-1;
                    pointAns = new Point(lx, ly);
                    answer.setPoints(point, pointAns);
                    return answer;
                }
                else return answer;
            }
        }

    }
}
