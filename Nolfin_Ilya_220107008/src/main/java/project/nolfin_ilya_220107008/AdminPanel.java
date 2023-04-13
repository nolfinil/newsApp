package project.nolfin_ilya_220107008;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AdminPanel {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text errorText;

    @FXML
    private TextField loginField;

    @FXML
    private Button loginPageLogInButton;

    @FXML
    private PasswordField passwordField;
    @FXML
    private Text forgotPassword;
    @FXML
    private CheckBox rememberMe;

    @FXML
    private Text versionText;
    boolean checkData(){
        String userNameStr = "", password = "";

        try (
                DataInputStream user = new DataInputStream(new FileInputStream("cargo/"+loginField.getText()+".txt"));
        ){
            userNameStr = user.readUTF();
            password = user.readUTF();
            user.readUTF();
        }catch (EOFException ex) {
            System.out.println(password);
        }catch (IOException ex) {
            ex.printStackTrace();
        }
        password = password.substring(0,password.length()-1);

        int checker = 0, checker1 = 0;
        for (int i = 0; i < loginField.getText().length(); i++)
            if(loginField.getText().charAt(i)==' ')
                checker++;
        for (int i = 0; i < passwordField.getText().length(); i++)
            if(passwordField.getText().charAt(i)==' ')
                checker1++;

        // Compare text length with checker and check for empty strings
        if(loginField.getText().isEmpty()||passwordField.getText().isEmpty() || checker == loginField.getText().length() || checker1 == passwordField.getText().length()){
            errorText.setText("You have empty strings");
            return false;
        }
        else if(!new File("cargo/"+loginField.getText()+".txt").exists()){
            errorText.setText("UserName is not exist");
            return false;
        }
        else if(!passwordField.getText().equals(password)){
            errorText.setText("Wrong Password");
            return false;
        }
        else{
            if(rememberMe.isSelected()){
                try(
                        FileOutputStream newUser = new FileOutputStream("remembering.txt");
                ){
                    DataOutputStream newData = new DataOutputStream(newUser);
                    newData.writeUTF(userNameStr);
                    newData.writeUTF(password);
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }
            return true;
        }
    }


    @FXML
    void initialize() {
        forgotPassword.setOnMouseClicked(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("NewsPage1.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root));
            primaryStage.setTitle("Forgot Password");
            primaryStage.show();
        });
        //       MouseEvents Hover object
        loginPageLogInButton.setOnMouseMoved(event -> {
            loginPageLogInButton.setTextFill(Color.BLACK);
        });
        loginPageLogInButton.setOnMouseExited(event -> {
            loginPageLogInButton.setTextFill(Color.WHITE);
        });
        rememberMe.setOnMouseMoved(event -> {
            rememberMe.setTextFill(Color.RED);
        });
        rememberMe.setOnMouseExited(event -> {
            rememberMe.setTextFill(Color.WHITE);
        });
        forgotPassword.setOnMouseMoved(event -> {
            forgotPassword.setFill(Color.RED);
        });
        forgotPassword.setOnMouseExited(event -> {
            forgotPassword.setFill(Color.WHITE);
        });
        versionText.setOnMouseMoved(event -> {
            versionText.setFill(Color.RED);
        });
        versionText.setOnMouseExited(event -> {
            versionText.setFill(Color.WHITE);
        });
        versionText.setOnMouseClicked(event -> {
            versionText.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("LogInPage.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root,700,400));
            primaryStage.setTitle("Log In");
            primaryStage.show();
        });
        loginPageLogInButton.setOnAction(actionEvent -> {
            if(checkData()) {
                System.out.println("LogIn successful");
                loginPageLogInButton.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("informationPage.fxml"));
                try {
                    loader.load();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Parent root = loader.getRoot();
                Stage primaryStage = new Stage();
                primaryStage.setScene(new Scene(root, 700, 400));
                primaryStage.setTitle("News Page");
                primaryStage.showAndWait();
            }
        });
    }

}
