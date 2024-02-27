module com.example.softwareoopjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.softwareoopjavafx to javafx.fxml;
    exports com.example.softwareoopjavafx;
}