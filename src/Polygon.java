import java.util.Locale;

public class Polygon extends Shape{
    private Point[] arr;
    private Style styleSettings;
    public Polygon(int count, Style styleSettings, Style style) {
        super(style);
        arr = new Point[count];
        this.styleSettings = styleSettings;
    }
    public Polygon(int count, Style styleSettings) {
        super(new Style(null, null, 1));
        arr = new Point[count];
        this.styleSettings = styleSettings;
    }

    public void setPoint(int index, Point point) {
        arr[index] = point;
    }

    public void setPoints(Point[] points){
        arr = points;
    }

    public String toSvg() {
        String pointsString = "";
        for(Point point : arr)
            pointsString += point.x + "," + point.y + " ";

        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" style = \"%s\"/>", pointsString,styleSettings.toSvg());
    }
    public Point getMaxCords(){
        double x = 0, y=0;
        Point ans;
        for(Point point : arr){
            if(point.x > x) x = point.x;
            if(point.y > y) y = point.y;
        }
        ans = new Point(x,y);
        return ans;
    }
}