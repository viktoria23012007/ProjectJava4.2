module com.example.main5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.main5 to javafx.fxml;
    exports com.example.main5;
}