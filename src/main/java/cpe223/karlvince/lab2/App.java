package cpe223.karlvince.lab2; // Introduction to JAVAFX with Maven

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;

import java.io.IOException;

public class App extends Application {

    public static final String DFONT = "Verdana Bold";
    public static final int DSIZE = 18;

    public static final int SCREENX = 1200;
    public static final int SCREENY = 640;

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        boolean isNotToggled[] = {true, true, true};

        // Polygon
        Polygon iluvpoland = PolygonConfig.piatos(4.5);
        Text polyDesc = Candy.quickText("POLYGON\n(PIATOS)", DFONT, 18, true, "#0317ca");

        iluvpoland.setOnMouseClicked(event -> {

            if (isNotToggled[0]) {
                polyDesc.setText("KARL\nVINCE");
                polyDesc.setFill(Color.WHITE);
                iluvpoland.setFill(Color.BLACK);
            } else {
                polyDesc.setText("POLYGON\n(PIATOS)");
                polyDesc.setFill(Color.web("#0317ca"));
                iluvpoland.setFill(Color.YELLOW);
            }
            isNotToggled[0] = !isNotToggled[0];

        });
        // Polygon

        // Circle
        int samuraiSize = 3; // Scaling

        Circle samurai = new Circle();
        samurai.setCenterX(100.0f * samuraiSize);
        samurai.setCenterY(100.0f * samuraiSize);
        samurai.setRadius(50.0f   * samuraiSize);
        samurai.setFill(Color.RED);
        samurai.setEffect(new DropShadow(10, 5, 5, Color.web("#f34ceb")));
        Text circleDesc = Candy.quickText("CIRCLE\n(JAPAN)", DFONT, 18, true, "#ffdbfd");

        samurai.setOnMouseClicked(event -> {

            if (isNotToggled[1]) {
                circleDesc.setText("JAVA");
                circleDesc.setFill(Color.WHITE);
                samurai.setFill(Color.BLACK);
            } else {
                circleDesc.setText("CIRCLE\n(JAPAN)");
                circleDesc.setFill(Color.web("#ffdbfd"));
                samurai.setFill(Color.RED);
            }
            isNotToggled[1] = !isNotToggled[1];

        });
        // Circle

        // Ellipse
        int truckSize = 4; // Scaling
        Ellipse footBall = new Ellipse();
        footBall.setCenterX(50.0f * truckSize);
        footBall.setCenterY(50.0f * truckSize);
        footBall.setRadiusX(50.0f * truckSize);
        footBall.setRadiusY(25.0f * truckSize);
        footBall.setFill(Color.web("#ec6b01"));
        footBall.setEffect(new DropShadow(10, 5, 5, Color.web("#979500")));
        Text ellipseDesc = Candy.quickText("Ellipse\n(Football)", DFONT, 18, true, "#ffffff");

        footBall.setOnMouseClicked(event -> {

            if (isNotToggled[2]) {
                ellipseDesc.setText("REYES");
                ellipseDesc.setFill(Color.WHITE);
                footBall.setFill(Color.BLACK);
            } else {
                ellipseDesc.setText("ELLIPSE\n(Football)");
                ellipseDesc.setFill(Color.web("#ffffff"));
                footBall.setFill(Color.web("#ec6b01"));
            }
            isNotToggled[2] = !isNotToggled[2];

        });

        // Ellipse
        
        // Display Config
        HBox box = new HBox(75);
        box.setAlignment(Pos.CENTER);

        StackPane poland    = new StackPane(iluvpoland, polyDesc);
        StackPane japan     = new StackPane(samurai,    circleDesc);
        StackPane america   = new StackPane(footBall,   ellipseDesc);
        
        box.getChildren().addAll(poland, japan, america);

        scene = new Scene(box, SCREENX, SCREENY);
        stage.setTitle("CPE 223 - Software Design | Laboratory Task 2: INTRODUCTION TO JAVAFX WITH MAVEN");
        stage.setScene(scene);
        stage.show();
        // Display Config

    }

    public static void main(String[] args) {
        launch();
    }

}

/*

    REFERENCES:
    https://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/Polygon.html
    https://docs.oracle.com/javase/8/javafx/api/javafx/scene/paint/Color.html
    https://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/Ellipse.html

*/