module com.isp.isp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires kernel;
    requires layout;
    requires org.bouncycastle.provider;


    opens com.isp to javafx.fxml;
    exports com.isp;
    exports com.isp.faiaz;
    opens com.isp.faiaz to javafx.fxml;
    opens com.isp.musficur to javafx.fxml;
    opens com.isp.fardeen to javafx.fxml;
    opens com.isp.siddique to javafx.fxml;
}