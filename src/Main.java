public class Main {
    public static void main(String[] args) {
        Point point = new Point(5,3);
        Point point1 = new Point(1,1);
        Segment segment = new Segment();
        segment.setPoints(point, point1);
        segment.length();
        System.out.println(segment.toSvg());
    }
}