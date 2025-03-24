module com.isp.isp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.isp.isp to javafx.fxml;
    exports com.isp.isp;
}