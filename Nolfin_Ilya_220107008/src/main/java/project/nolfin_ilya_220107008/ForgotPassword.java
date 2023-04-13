package project.nolfin_ilya_220107008;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ForgotPassword {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField emailField;

    @FXML
    private Text forgottext;

    @FXML
    private Button getPassword;

    @FXML
    private TextField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    private Text versionText1;

    void forgotPass(){
        String userNameStr = "", password = "",email = "";

        try (
                DataInputStream user = new DataInputStream(new FileInputStream("cargo/"+usernameField.getText()+".txt"));
        ){
            userNameStr = user.readUTF();
            password = user.readUTF();
            email = user.readUTF();
        }catch (IOException ex) {
            ex.printStackTrace();
        }

        email = email.substring(0, email.length()-1);
        if(emailField.getText().equals(email)){
            passwordField.setText(password);
        }
    }

    @FXML
    void initialize() {
        passwordField.setEditable(false);
        getPassword.setOnMouseMoved(event -> {
            getPassword.setTextFill(Color.BLACK);
        });
        getPassword.setOnMouseExited(event -> {
            getPassword.setTextFill(Color.WHITE);
    });
        getPassword.setOnAction(actionEvent -> {
            forgotPass();
        });

    }

}
