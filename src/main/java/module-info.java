module com.silverlink.middleman {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.silverlink.middleman to javafx.fxml;
    exports com.silverlink.middleman;
}