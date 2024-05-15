module milestonecalculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens milestonecalculator to javafx.fxml;
    exports milestonecalculator;
}
