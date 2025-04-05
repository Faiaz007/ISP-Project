module com.isp.isp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.isp to javafx.fxml;
    exports com.isp;
}