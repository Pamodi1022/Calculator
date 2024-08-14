module com.iit.calculators {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iit.calculators to javafx.fxml;
    exports com.iit.calculators;
}