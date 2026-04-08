module cpe223.karlvince.lab2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires transitive javafx.graphics;

    opens cpe223.karlvince.lab2 to javafx.fxml;
    exports cpe223.karlvince.lab2;
}
