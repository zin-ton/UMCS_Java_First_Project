import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class SvgScene {
    private ArrayList<Polygon> polygons = new ArrayList<>();
    private int height = 0, width = 0;
    public void addPolygon(Polygon polygon){
        this.polygons.add(polygon);
        Point size = polygon.getMaxCords();
        if(height < size.y){
            this.height = (int)(size.y+1);
        }
        if(width < size.x){
            this.width = (int)(size.x+1);
        }

    }
    public void save(String path){
        String svg = String.format(Locale.ENGLISH, "<svg width=\"%d\" height=\"%d\">", width, height);
        for(Polygon polygon : polygons){
            svg += polygon.toSvg();
        }
        svg += "</svg>";
        try {
            FileWriter html
                    = new FileWriter(path);
            html.write(svg);
            html.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
