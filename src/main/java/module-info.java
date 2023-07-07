module com.example.gui_dfspathfinder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gui_dfspathfinder to javafx.fxml;
    exports com.example.gui_dfspathfinder;
}