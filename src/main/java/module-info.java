module com.example.elevatorsimulator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.elevatorsimulator to javafx.fxml;
    exports com.example.elevatorsimulator;
}