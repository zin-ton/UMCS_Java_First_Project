public class Polygon {
    private Point[] points = new Point[1];
    public void Polygon(Point point1){
        points[1] = new Point(1,1);
        this.points[1] = point1;
    }
    public void set_point(int n, Point point1){
        if(points.length < n){
            points = new Point[(n-points.length)+1];
            points[n] = new Point(1,1);
            points[n] = point1;
        }
    }
    public String ToSvg(int a, int b){
        String ans;
        ans = "<line x1 = ";
        ans += '"';
        ans += Math.min(points[a].x, points[b].x);
        ans += '"';
        ans += " x2 = ";
        ans += '"';
        ans += Math.max(points[a].x, points[b].x);
        ans += '"';
        ans += " y1 = ";
        ans += '"';
        ans += Math.min(points[a].y, points[b].y);
        ans += '"';
        ans += " y2 = ";
        ans += '"';
        ans += Math.max(points[a].y, points[b].y);
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
}
