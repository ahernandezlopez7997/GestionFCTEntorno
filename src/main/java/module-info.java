module org.example.appgestionfct {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens org.example.appgestionfct to javafx.fxml;
    exports org.example.appgestionfct;
}