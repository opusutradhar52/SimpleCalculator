package tomato.simple_calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        Scene sc = new Scene(p);
        stage.setTitle("Calculator");
        stage.setScene(sc);
        stage.show();
    }

    static void main(String[] args) {
        launch(args);
    }
}
