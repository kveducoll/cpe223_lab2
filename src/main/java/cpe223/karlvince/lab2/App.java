package cpe223.karlvince.lab2; // Introduction to JAVAFX with Maven

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.shape.*;

import java.io.IOException;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        // Polygon
        Polygon iluvpoland = PolygonConfig.littleHouse();
        StackPane pain = new StackPane(iluvpoland);
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

*/