public class Main {
    public static void main(String[] args) {
        Point point = new Point(1,1);
        Point point1 = new Point(3,1);
        Segment segment = new Segment();
        segment.setPoints(point, point1);
        //segment.length();
        //System.out.println(segment.toSvg());
        Point first = new Point(2,2);
        Segment answer = segment.paral(segment, first);
        answer.print_points();
    }
}