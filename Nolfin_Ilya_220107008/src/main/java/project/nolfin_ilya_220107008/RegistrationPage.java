package project.nolfin_ilya_220107008;


import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RegistrationPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField emailField;

    public String errorString;

    @FXML
    private RadioButton femaleRadioButton;

    @FXML
    private RadioButton maleRadioButton;

    @FXML
    private RadioButton otherRadioButton;

    @FXML
    private TextField passwordField;

    @FXML
    private Button signUpPagePageLogInButton;

    @FXML
    private Button signUpPageSignUpButton;

    @FXML
    private TextField usernameField;

    @FXML
    private Text versionText;
    public long lines = 0;

    public void countLines() {

        File file = new File("cargo/database.txt");

        lines = 0;


        try (LineNumberReader lnr = new LineNumberReader(new FileReader(file))) {
            int checker= 1;
            while (lnr.readLine() != null){
                checker++;
                if(checker%2==0){
                    passwordStr+=lnr.readLine()+"\n";
                }

            };

            lines = lnr.getLineNumber();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    boolean logic(){
        countLines();
        System.out.println("Lines: "+lines);
        System.out.println("Users REGISTERED before:"+lines/3);
        if(usernameField.getText().equals(passwordField.getText())) {
            errorString = "Password Matched";
            return false;
        }
        String str = "password: "+ usernameField.getText();
        Scanner scanner = new Scanner(passwordStr+"!");
        while (scanner.hasNextLine()){
            if(str.equals(scanner.nextLine())){
                errorString = "Password Matched";
                return false;
            }
        }
        return true;
    }
    boolean checkData(){
        File file = new File("cargo/"+usernameField.getText()+".txt");
        if(file.exists()) {
            errorString = "Username is taken";
            return true;
        }
        else
            return false;
    }
    boolean reg(){
        int checker = 0, checker1 = 0, checker2= 0;
        for (int i = 0; i < usernameField.getText().length(); i++)
            if(usernameField.getText().charAt(i)==' ')
                checker++;
        for (int i = 0; i < passwordField.getText().length(); i++)
            if(passwordField.getText().charAt(i)==' ')
                checker1++;
        for (int i = 0; i < emailField.getText().length(); i++) {
            if(emailField.getText().charAt(i)==' ')
                checker2++;
        }
        // Compare text length with checker and check for empty strings
        if(passwordField.getText().length()<8 && (usernameField.getText().isEmpty()||passwordField.getText().isEmpty() || checker == usernameField.getText().length() || checker1 == passwordField.getText().length())){
            errorString = ("Your password must have 8 symbols \n and you have empty strings");
            return false;
        }
        else if(usernameField.getText().isEmpty()||passwordField.getText().isEmpty() || emailField.getText().isEmpty()|| checker == usernameField.getText().length() || checker1 == passwordField.getText().length() || checker2 == emailField.getText().length()){
            errorString = ("You have empty strings");
            return false;
        }
        else if(passwordField.getText().length()<8){
            errorString = ("Your password must have 8 symbols");
            return false;
        }
        else if(!(emailField.getText().contains("@"))) {
            errorString = ("Your email must have @ symbol");
            return false;
        } else if(!(maleRadioButton.isSelected() || femaleRadioButton.isSelected() || otherRadioButton.isSelected())){
            errorString = ("You have not selected your sex");
            return false;
        }else if(checkData()){
            errorString = "Username is taken";
            return false;
        }else {
            return logic();
        }

    }

    @FXML
    void initialize() {
        //       MouseEvents Hover object
        mouseHovering();
        //make one group of radioButtons
        ToggleGroup toggleGroup = new ToggleGroup();
        femaleRadioButton.setToggleGroup(toggleGroup);
        maleRadioButton.setToggleGroup(toggleGroup);
        otherRadioButton.setToggleGroup(toggleGroup);

        signUpPageSignUpButton.setOnAction(actionEvent -> {
            if(reg()) {
                createFolder();
                readFile();
                addData();
                System.out.println("Registration Successfully");
                signUpPagePageLogInButton.getScene().getWindow().hide();
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
                primaryStage.show();

            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Ooops, Error");
                alert.setContentText(errorString);
                alert.show();
            }
        });
        signUpPagePageLogInButton.setOnAction(actionEvent -> {
            signUpPagePageLogInButton.getScene().getWindow().hide();
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
    }
    void mouseHovering(){
        signUpPagePageLogInButton.setOnMouseMoved(event -> {
            signUpPagePageLogInButton.setTextFill(Color.BLACK);
        });
        signUpPagePageLogInButton.setOnMouseExited(event -> {
            signUpPagePageLogInButton.setTextFill(Color.WHITE);
        });
        signUpPageSignUpButton.setOnMouseMoved(event -> {
            signUpPageSignUpButton.setTextFill(Color.BLACK);
        });
        signUpPageSignUpButton.setOnMouseExited(event -> {
            signUpPageSignUpButton.setTextFill(Color.WHITE);
        });
        maleRadioButton.setOnMouseMoved(event -> {
            maleRadioButton.setTextFill(Color.RED);
        });
        maleRadioButton.setOnMouseExited(event -> {
            maleRadioButton.setTextFill(Color.WHITE);
        });
        femaleRadioButton.setOnMouseMoved(event -> {
            femaleRadioButton.setTextFill(Color.RED);
        });
        femaleRadioButton.setOnMouseExited(event -> {
            femaleRadioButton.setTextFill(Color.WHITE);
        });
        otherRadioButton.setOnMouseMoved(event -> {
            otherRadioButton.setTextFill(Color.RED);
        });
        otherRadioButton.setOnMouseExited(event -> {
            otherRadioButton.setTextFill(Color.WHITE);
        });
        versionText.setOnMouseMoved(event -> {
            versionText.setFill(Color.RED);
        });
        versionText.setOnMouseExited(event -> {
            versionText.setFill(Color.WHITE);
        });
    }
    void createFolder(){
        try(
        FileOutputStream newUser = new FileOutputStream("cargo/"+usernameField.getText()+".txt");
        ){
            DataOutputStream newData = new DataOutputStream(newUser);
            newData.writeUTF(usernameField.getText()+"\n");
            newData.writeUTF(passwordField.getText()+"\n");
            newData.writeUTF(emailField.getText()+"\n");
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
    public String userStr = "";
    public String dataStr = "";
    public String passwordStr = "";

    void readFile(){
        try(
        FileInputStream user = new FileInputStream("cargo/"+usernameField.getText()+".txt")
        ){
            DataInputStream userDat = new DataInputStream(user);
                userStr += "username: "+userDat.readUTF();
                userStr += "password: "+userDat.readUTF();
                userStr += "email: "+userDat.readUTF();

        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    void addData() {
        try(FileInputStream data = new FileInputStream("cargo/database.txt")){
            DataInputStream dataDat = new DataInputStream(data);
            while (true) {
                dataStr += dataDat.readUTF();
            }
        }catch (EOFException ex){
//            System.out.println(dataStr);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        try(
        RandomAccessFile randomAccessFile = new RandomAccessFile("cargo/database.txt","rw");
        ){
            randomAccessFile.writeUTF(dataStr);
            randomAccessFile.writeUTF(userStr);
            randomAccessFile.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
