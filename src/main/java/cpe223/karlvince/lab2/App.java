package cpe223.karlvince.lab2; // Introduction to JAVAFX with Maven

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
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

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        // Polygon
        boolean isZabka[] = {true};
        Polygon iluvpoland = PolygonConfig.piatos(4.5);
        Text polyDesc = Candy.quickText("POLYGON\n(PIATOS)", dFont, 18, true, "#0317ca");
        StackPane pain = new StackPane(iluvpoland, polyDesc);

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

        // Display Config
        scene = new Scene(pain, 640, 480);
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