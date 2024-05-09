module org.example.appgestionfct {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.appgestionfct to javafx.fxml;
    exports org.example.appgestionfct;
}