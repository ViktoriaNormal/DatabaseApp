module com.example.database_application {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.database_application to javafx.fxml;
    exports com.example.database_application;
}