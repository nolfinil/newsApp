package project.nolfin_ilya_220107008;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class ControllPanel extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        if(!new File("remembering.txt").exists()) {
            FXMLLoader fxmlLoader = new FXMLLoader(ControllPanel.class.getResource("LogInPage.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 700, 400);
            stage.setTitle("Log In");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }else {
            FXMLLoader fxmlLoader = new FXMLLoader(ControllPanel.class.getResource("informationPage.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 700, 400);
            stage.setTitle("News");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}