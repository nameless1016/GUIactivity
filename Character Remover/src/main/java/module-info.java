module com.example.characterremover {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.characterremover to javafx.fxml;
    exports com.example.characterremover;
}