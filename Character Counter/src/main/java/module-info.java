module com.example.charactercounter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.charactercounter to javafx.fxml;
    exports com.example.charactercounter;
}