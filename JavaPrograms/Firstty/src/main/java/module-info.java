module com.example.firstty {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstty to javafx.fxml;
    exports com.example.firstty;
}