package project.nolfin_ilya_220107008;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BusinessInformationPage2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button businessButton;

    @FXML
    private MenuButton businessMenu;

    @FXML
    private MenuItem busyItem1;

    @FXML
    private MenuItem busyItem2;

    @FXML
    private MenuItem busyItem3;

    @FXML
    private Button contactUsButton;

    @FXML
    private Button economyButton;

    @FXML
    private MenuItem economyItem1;

    @FXML
    private MenuItem economyItem2;

    @FXML
    private MenuItem economyItem3;

    @FXML
    private MenuButton economyMenu;

    @FXML
    private Text errorText;

    @FXML
    private VBox label1;

    @FXML
    private VBox label2;

    @FXML
    private VBox label3;

    @FXML
    private VBox label4;

    @FXML
    private Button logOut;

    @FXML
    private ImageView newsImage1;

    @FXML
    private ImageView newsImage2;

    @FXML
    private ImageView newsImage3;

    @FXML
    private ImageView newsImage4;

    @FXML
    private Text newsText1;

    @FXML
    private Text newsText2;

    @FXML
    private Text newsText3;

    @FXML
    private Text newsText4;

    @FXML
    private MenuItem sportItem1;

    @FXML
    private MenuItem sportItem2;

    @FXML
    private MenuItem sportItem3;

    @FXML
    private MenuButton sportMenu;

    @FXML
    private Button sportsButton;

    @FXML
    private MenuItem techItem1;

    @FXML
    private MenuItem techItem2;

    @FXML
    private MenuItem techItem3;

    @FXML
    private MenuButton techMenu;

    @FXML
    private Button technologyButton;

    @FXML
    void initialize() {
        //menu items
        itemActions();
        //news
        mouseClickOnNews();
        //effect
        mouseHovering();
        //button clicked
        buttonActions();
    }
    void mouseHovering(){
        double x =label1.getPrefWidth();
        double y = label1.getPrefHeight();
        double x1 = x+5;
        double y1 = y+5;
        label1.setOnMouseMoved(event -> {
            newsImage1.setFitHeight(148);
            newsImage1.setFitWidth(256);
            label1.setMaxSize(x1,y1);
            label1.setPrefSize(x1,y1);
            label1.setBackground(Background.fill(Color.DARKRED));
            newsText1.setFill(Color.WHITE);
        });
        label1.setOnMouseExited(event -> {
            newsImage1.setFitHeight(143);
            newsImage1.setFitWidth(251);
            label1.setMinSize(x,y);
            label1.setPrefSize(x, y);
            label1.setBackground(Background.fill(Color.WHITE));
            newsText1.setFill(Color.BLACK);

        });
        //label2
        label2.setOnMouseMoved(event -> {
            newsImage2.setFitHeight(148);
            newsImage2.setFitWidth(256);
            label2.setMaxSize(x1,y1);
            label2.setPrefSize(x1,y1);
            label2.setBackground(Background.fill(Color.DARKRED));
            newsText2.setFill(Color.WHITE);

        });
        label2.setOnMouseExited(event -> {
            newsImage2.setFitHeight(143);
            newsImage2.setFitWidth(251);
            label2.setMinSize(x,y);
            label2.setPrefSize(x, y);
            label2.setBackground(Background.fill(Color.WHITE));
            newsText2.setFill(Color.BLACK);
        });
        //label3
        label3.setOnMouseMoved(event -> {
            newsImage3.setFitHeight(148);
            newsImage3.setFitWidth(256);
            label3.setMaxSize(x1,y1);
            label3.setPrefSize(x1,y1);
            label3.setBackground(Background.fill(Color.DARKRED));
            newsText3.setFill(Color.WHITE);

        });
        label3.setOnMouseExited(event -> {
            newsImage3.setFitHeight(143);
            newsImage3.setFitWidth(251);
            label3.setMinSize(x,y);
            label3.setPrefSize(x, y);
            label3.setBackground(Background.fill(Color.WHITE));
            newsText3.setFill(Color.BLACK);
        });
        //label4
        label4.setOnMouseMoved(event -> {
            newsImage4.setFitHeight(143);
            newsImage4.setFitWidth(256);
            label4.setMaxSize(x1,y1);
            label4.setPrefSize(x1,y1);
            label4.setBackground(Background.fill(Color.DARKRED));
            newsText4.setFill(Color.WHITE);

        });
        label4.setOnMouseExited(event -> {
            newsImage4.setFitHeight(141);
            newsImage4.setFitWidth(271);
            label4.setMinSize(x,y);
            label4.setPrefSize(x, y);
            label4.setBackground(Background.fill(Color.WHITE));
            newsText4.setFill(Color.BLACK);
        });
        //btn
        sportsButton.setOnMouseMoved(event -> {
            sportsButton.setTextFill(Color.RED);
        });
        sportsButton.setOnMouseExited(event -> {
            sportsButton.setTextFill(Color.WHITE);
        });

        technologyButton.setOnMouseMoved(event -> {
            technologyButton.setTextFill(Color.RED);
        });
        technologyButton.setOnMouseExited(event -> {
            technologyButton.setTextFill(Color.WHITE);
        });

        economyButton.setOnMouseMoved(event -> {
            economyButton.setTextFill(Color.RED);
        });
        economyButton.setOnMouseExited(event -> {
            economyButton.setTextFill(Color.WHITE);
        });

        businessButton.setOnMouseMoved(event -> {
            businessButton.setTextFill(Color.RED);
        });
        businessButton.setOnMouseExited(event -> {
            businessButton.setTextFill(Color.WHITE);
        });

        logOut.setOnMouseMoved(event -> {
            logOut.setTextFill(Color.RED);
        });
        logOut.setOnMouseExited(event -> {
            logOut.setTextFill(Color.WHITE);
        });

        contactUsButton.setOnMouseMoved(event -> {
            contactUsButton.setTextFill(Color.RED);
        });
        contactUsButton.setOnMouseExited(event -> {
            contactUsButton.setTextFill(Color.WHITE);
        });
        technologyButton.setOnAction(actionEvent -> {
            technologyButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("informationPage.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root,700,400));
            primaryStage.setTitle("Technological News Page");
            primaryStage.show();
        });
        economyButton.setOnAction(actionEvent -> {
            economyButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("EconomyInformationPage.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root,700,400));
            primaryStage.setTitle("Economy News Page");
            primaryStage.show();
        });
        sportsButton.setOnAction(actionEvent -> {
            sportsButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("SportsInformationPage.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root,700,400));
            primaryStage.setTitle("Sport News Page");
            primaryStage.show();
        });
        logOut.setOnAction(actionEvent -> {
            logOut.getScene().getWindow().hide();
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
        contactUsButton.setOnAction(actionEvent -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("contactUs.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root));
            primaryStage.setTitle("Contact Us");
            primaryStage.show();
        });

    }
    void mouseClickOnNews(){
        label1.setOnMouseClicked(event -> {
            String str = "Ye on properly handsome returned throwing am no whatever. In without wishing he of picture no exposed talking minutes. Curiosity continual belonging offending so explained it exquisite. Do remember to followed yourself material mr recurred carriage. High drew west we no or at john. About or given on witty event. Or sociable up material bachelor bringing landlord confined. Busy so many in hung easy find well up. So of exquisite my an explained remainder. Dashwood denoting securing be on perceive my laughing so.\n" +
                    "\n" +
                    "Received the likewise law graceful his. Nor might set along charm now equal green. Pleased yet equally correct colonel not one. Say anxious carried compact conduct sex general nay certain. Mrs for recommend exquisite household eagerness preserved now. My improved honoured he am ecstatic quitting greatest formerly.\n" +
                    "\n" +
                    "So by colonel hearted ferrars. Draw from upon here gone add one. He in sportsman household otherwise it perceived instantly. Is inquiry no he several excited am. Called though excuse length ye needed it he having. Whatever throwing we on resolved entrance together graceful. Mrs assured add private married removed believe did she.";
            Alert info1 = new Alert(Alert.AlertType.INFORMATION);
            info1.setTitle("News");
            info1.setHeaderText("TENGE AND DOLLAR");
            info1.setContentText(str);
            info1.show();
        });
        label2.setOnMouseClicked(event -> {
            String str = "Give lady of they such they sure it. Me contained explained my education. Vulgar as hearts by garret. Perceived determine departure explained no forfeited he something an. Contrasted dissimilar get joy you instrument out reasonably. Again keeps at no meant stuff. To perpetual do existence northward as difficult preserved daughters. Continued at up to zealously necessary breakfast. Surrounded sir motionless she end literature. Gay direction neglected but supported yet her.\n" +
                    "\n" +
                    "Perhaps far exposed age effects. Now distrusts you her delivered applauded affection out sincerity. As tolerably recommend shameless unfeeling he objection consisted. She although cheerful perceive screened throwing met not eat distance. Viewing hastily or written dearest elderly up weather it as. So direction so sweetness or extremity at daughters. Provided put unpacked now but bringing.";
            Alert info1 = new Alert(Alert.AlertType.INFORMATION);
            info1.setTitle("News");
            info1.setHeaderText("dollars");
            info1.setContentText(str);
            info1.show();
        });
        label3.setOnMouseClicked(event -> {
            String str = "Resolution possession discovered surrounded advantages has but few add. Yet walls times spoil put. Be it reserved contempt rendered smallest. Studied to passage it mention calling believe an. Get ten horrible remember pleasure two vicinity. Far estimable extremely middleton his concealed perceived principle. Any nay pleasure entrance prepared her.\n";
            Alert info1 = new Alert(Alert.AlertType.INFORMATION);
            info1.setTitle("News");
            info1.setHeaderText("SDY BUSINESS SCHOOL");
            info1.setContentText(str);
            info1.show();
        });
        label4.setOnMouseClicked(event -> {
            String str = "To they four in love. Settling you has separate supplied bed. Concluded resembled suspected his resources curiosity joy. Led all cottage met enabled attempt through talking delight. Dare he feet my tell busy. Considered imprudence of he friendship boisterous.\n";
            Alert info1 = new Alert(Alert.AlertType.INFORMATION);
            info1.setTitle("News");
            info1.setHeaderText("MONEY MONEY AND MONEY");
            info1.setContentText(str);
            info1.show();
        });
    }
    void buttonActions(){
        technologyButton.setOnAction(actionEvent -> {
            techMenu.show();
        });
        sportsButton.setOnAction(actionEvent -> {
            sportMenu.show();
        });
        businessButton.setOnAction(actionEvent -> {
            businessMenu.show();
        });
        economyButton.setOnAction(actionEvent -> {
            economyMenu.show();
        });
        logOut.setOnAction(actionEvent -> {
            File file = new File("remembering.txt");
            file.delete();
            logOut.getScene().getWindow().hide();
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
        contactUsButton.setOnAction(actionEvent -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("contactUs.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root));
            primaryStage.setTitle("Contact Us");
            primaryStage.show();
        });
    }
    void itemActions(){
        techItem1.setOnAction(actionEvent -> {
            technologyButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("informationPage.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root,700,400));
            primaryStage.setTitle("Technological News Page");
            primaryStage.show();
        });
        techItem2.setOnAction(actionEvent -> {
            technologyButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("informationPage1.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root,700,400));
            primaryStage.setTitle("Technological News Page");
            primaryStage.show();
        });
        techItem3.setOnAction(actionEvent -> {
            technologyButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("informationPage2.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root,700,400));
            primaryStage.setTitle("Technological News Page");
            primaryStage.show();
        });
        sportItem1.setOnAction(actionEvent -> {
            sportsButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("SportsInformationPage.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root,700,400));
            primaryStage.setTitle("Sport News Page");
            primaryStage.show();
        });
        sportItem2.setOnAction(actionEvent -> {
            sportsButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("SportsInformationPage1.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root,700,400));
            primaryStage.setTitle("Sport News Page");
            primaryStage.show();
        });
        sportItem3.setOnAction(actionEvent -> {
            sportsButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("SportsInformationPage2.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root,700,400));
            primaryStage.setTitle("Sport News Page");
            primaryStage.show();
        });
        busyItem1.setOnAction(actionEvent -> {
            businessButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("BusinessInformationPage.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root1 = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root1,700,400));
            primaryStage.setTitle("Business News Page");
            primaryStage.show();
        });
        busyItem2.setOnAction(actionEvent -> {
            businessButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("BusinessInformationPage1.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root1 = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root1,700,400));
            primaryStage.setTitle("Business News Page");
            primaryStage.show();
        });
        busyItem3.setOnAction(actionEvent -> {
            businessButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("BusinessInformationPage2.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root1 = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root1,700,400));
            primaryStage.setTitle("Business News Page");
            primaryStage.show();
        });
        economyItem1.setOnAction(actionEvent -> {
            economyButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("EconomyInformationPage.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root,700,400));
            primaryStage.setTitle("Economy News Page");
            primaryStage.show();
        });
        economyItem2.setOnAction(actionEvent -> {
            economyButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("EconomyInformationPage1.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root,700,400));
            primaryStage.setTitle("Economy News Page");
            primaryStage.show();
        });
        economyItem3.setOnAction(actionEvent -> {
            economyButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("EconomyInformationPage2.fxml"));
            try{
                loader.load();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root,700,400));
            primaryStage.setTitle("Economy News Page");
            primaryStage.show();
        });
    }

}
