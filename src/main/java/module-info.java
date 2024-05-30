module org.example.eightgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.eightgame to javafx.fxml;
    exports org.example.eightgame;
}