module org.example.guievents {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.guievents to javafx.fxml;
    exports org.example.guievents;
}