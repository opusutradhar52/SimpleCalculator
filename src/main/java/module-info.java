module tomato.simple_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens tomato.simple_calculator to javafx.fxml;
    exports tomato.simple_calculator;
}