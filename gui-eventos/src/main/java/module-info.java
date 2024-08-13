module org.example.guieventos {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.guieventos to javafx.fxml;
    exports org.example.guieventos;
}