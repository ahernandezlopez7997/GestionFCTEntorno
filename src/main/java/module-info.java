module org.example.appgestionfct {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.appgestionfct to javafx.fxml;
    exports org.example.appgestionfct;
}