package tomato.simple_calculator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField display;

    String oprator = "";
    Double num1 = 0.0;
    boolean start = true;

    @FXML
    void digitact(ActionEvent event) {
        if (start == true) {
            display.setText("");
            start = false;
        }
        String oldText = display.getText();
        String newText = ((Button) event.getSource()).getText();
        display.setText(oldText + newText);
    }

    @FXML
    void operatoract(ActionEvent event) {
        num1 = Double.parseDouble(display.getText());
        oprator = ((Button) event.getSource()).getText();
        display.setText("");
    }

    @FXML
    void equal(ActionEvent event) {
        Double num2 = Double.parseDouble(display.getText());
        switch (oprator) {
            case "+" -> display.setText("" + (num1 + num2));
            case "-" -> display.setText("" + (num1 - num2));
            case "x" -> display.setText("" + (num1 * num2));
            case "/" -> {
                if (num2 != 0)
                    display.setText("" + (num1 / num2));
                else
                    display.setText("Math Error!");
            }
        }
        start = true;
    }

    @FXML
    void percentage(ActionEvent event) {
        double num = Double.parseDouble(display.getText());
        display.setText("" + (num / 100));
        start = true;
    }

    @FXML
    void decimal(ActionEvent event) {
        if (!display.getText().contains(".")) {
            display.setText(display.getText() + ".");
        }
    }

    @FXML
    void allclear(ActionEvent event) {
        display.setText("0");
        num1 = 0.0;
        oprator = "";
        start = true;
    }

    @FXML
    void oneclear(ActionEvent event) {
        String current = display.getText();
        if (current.length() > 1) {
            display.setText(current.substring(0, current.length() - 1));
        } else {
            display.setText("0");
            start = true;
        }
    }

    @FXML
    void offbt(ActionEvent event) {
        Platform.exit();
    }

}