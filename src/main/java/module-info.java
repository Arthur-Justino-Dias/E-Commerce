module com.example.ecommerce {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.sql;

    requires mysql.connector.j;

    opens com.example.ecommerce to javafx.fxml;
    exports com.example.ecommerce;
    exports com.example.ecommerce.Controller;
    opens com.example.ecommerce.Controller to javafx.fxml;
}