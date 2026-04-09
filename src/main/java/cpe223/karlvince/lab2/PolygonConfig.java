package cpe223.karlvince.lab2;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;

public class PolygonConfig {
    
    public static Polygon littleHouse() {
        return littleHouse(1, "RED");
    }

    public static Polygon littleHouse(int scale, String color) {

        Polygon x = new Polygon(
            60.0, 0.0,
            100.0, 60.0,
            100.0, 140.0,
            20.0, 140.0,
            20.0, 60.0
        );

        x.setFill(Paint.valueOf(color));
        return x;

    }

}
