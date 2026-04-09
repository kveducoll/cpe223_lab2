package cpe223.karlvince.lab2; // Introduction to JAVAFX with Maven

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;

import java.io.IOException;

public class App extends Application {

    public static final String dFont = "Verdana Bold";
    public static final int dSize = 18;

    public static final int screenX = 1200;
    public static final int screenY = 640;

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        // Polygon
        boolean isZabka[] = {true};
        Polygon iluvpoland = PolygonConfig.piatos(4.5);
        Text polyDesc = Candy.quickText("POLYGON\n(PIATOS)", dFont, 18, true, "#0317ca");

        iluvpoland.setOnMouseClicked(event -> {

            if (isZabka[0]) {
                polyDesc.setText("KARL\nVINCE");
                polyDesc.setFill(Color.WHITE);
                iluvpoland.setFill(Color.BLACK);
            } else {
                polyDesc.setText("POLYGON\n(PIATOS)");
                polyDesc.setFill(Color.web("#0317ca"));
                iluvpoland.setFill(Color.YELLOW);
            }
            isZabka[0] = !isZabka[0];

        });
        // Polygon

        // Circle
        int samuraiSize = 3;
        boolean isToyota[] = {true};

        Circle samurai = new Circle();
        samurai.setCenterX(100.0f*samuraiSize);
        samurai.setCenterY(100.0f*samuraiSize);
        samurai.setRadius(50.0f*samuraiSize);
        samurai.setFill(Color.RED);
        Text circleDesc = Candy.quickText("CIRCLE\n(JAPAN)", dFont, 18, true, "#ffffff");

        samurai.setOnMouseClicked(event -> {

            if (isZabka[0]) {
                circleDesc.setText("JAVA");
                circleDesc.setFill(Color.WHITE);
                samurai.setFill(Color.BLACK);
            } else {
                circleDesc.setText("CIRCLE\n(JAPAN)");
                circleDesc.setFill(Color.web("#ffffff"));
                samurai.setFill(Color.RED);
            }
            isZabka[0] = !isZabka[0];

        });
        // Circle
        
        // Display Config
        HBox box = new HBox(75);
        box.setAlignment(Pos.CENTER);

        StackPane poland = new StackPane(iluvpoland, polyDesc);
        StackPane japan = new StackPane(samurai, circleDesc);

        box.getChildren().addAll(poland, japan);

        scene = new Scene(box, screenX, screenY);
        stage.setScene(scene);
        stage.show();
        // Display Config

    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}

/*

    REFERENCES:
    https://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/Polygon.html
    https://docs.oracle.com/javase/8/javafx/api/javafx/scene/paint/Color.html

*/