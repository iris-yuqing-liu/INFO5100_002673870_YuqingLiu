module com.example.multiformatimagemanagementtool {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.multiformatimagemanagementtool to javafx.fxml;
    exports com.example.multiformatimagemanagementtool;
}