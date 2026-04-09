package cpe223.karlvince.lab2;

import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Candy {

    public static Text quickText(String content, String font, int size, Boolean reflection, String colorhex) {

        Text x = new Text(content);
        x.setFont(new Font(font, size));

        if (reflection) x.setEffect(new Reflection());
        x.setFill(Color.web(colorhex));

        return x;

    }

}