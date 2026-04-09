package cpe223.karlvince.lab2;

import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;

public class PolygonConfig {
    
    public static Polygon LittleHouseDefault() {return littleHouseCustom(1, "RED", true, 10, 5, 5, "BLACK");}
    public static Polygon LittleHouseDefault(double scale) {return littleHouseCustom(scale, "RED", true, 10, 5, 5, "BLACK");}
    public static Polygon LittleHouseDefault(String color) {return littleHouseCustom(1, color, true, 10, 5, 5, "BLACK");}
    public static Polygon LittleHouseDefault(boolean shadow, double shadowBlurRad, int shadowX, int shadowY) {return littleHouseCustom(1, "RED", shadow, shadowBlurRad, shadowX, shadowY, "BLACK");}

    public static Polygon littleHouseCustom(double scale, String color, boolean shadow, double shadowBlurRad, int shadowX, int shadowY, String shadowColor) {

        Polygon x = new Polygon(
            60.0*scale, 0.0*scale,
            100.0*scale, 60.0*scale,
            100.0*scale, 140.0*scale,
            20.0*scale, 140.0*scale,
            20.0*scale, 60.0*scale
        );

        x.setFill(Paint.valueOf(color));
        x.setEffect(new DropShadow(shadowBlurRad, shadowX, shadowY, (Color) Paint.valueOf(shadowColor)));
        return x;

    }

}
