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

public class EconomyInformationPage2 {

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
            newsImage4.setFitHeight(148);
            newsImage4.setFitWidth(256);
            label4.setMaxSize(x1,y1);
            label4.setPrefSize(x1,y1);
            label4.setBackground(Background.fill(Color.DARKRED));
            newsText4.setFill(Color.WHITE);

        });
        label4.setOnMouseExited(event -> {
            newsImage4.setFitHeight(143);
            newsImage4.setFitWidth(251);
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
    }
    void mouseClickOnNews(){
        label1.setOnMouseClicked(event -> {
            String str = "Savings her pleased are several started females met. Short her not among being any. Thing of judge fruit charm views do. Miles mr an forty along as he. She education get middleton day agreement performed preserved unwilling. Do however as pleased offence outward beloved by present. By outward neither he so covered amiable greater. Juvenile proposal betrayed he an informed weddings followed. Precaution day see imprudence sympathize principles. At full leaf give quit to in they up.\n" +
                    "\n" +
                    "Insipidity the sufficient discretion imprudence resolution sir him decisively. Proceed how any engaged visitor. Explained propriety off out perpetual his you. Feel sold off felt nay rose met you. We so entreaties cultivated astonished is. Was sister for few longer mrs sudden talent become. Done may bore quit evil old mile. If likely am of beauty tastes.\n";
            Alert info1 = new Alert(Alert.AlertType.INFORMATION);
            info1.setTitle("News");
            info1.setHeaderText("BOOM");
            info1.setContentText(str);
            info1.show();
        });
        label2.setOnMouseClicked(event -> {
            String str = "Behind sooner dining so window excuse he summer. Breakfast met certainty and fulfilled propriety led. Waited get either are wooded little her. Contrasted unreserved as mr particular collecting it everything as indulgence. Seems ask meant merry could put. Age old begin had boy noisy table front whole given.\n" +
                    "\n" +
                    "Ladies others the six desire age. Bred am soon park past read by lain. As excuse eldest no moment. An delight beloved up garrets am cottage private. The far attachment discovered celebrated decisively surrounded for and. Sir new the particular frequently indulgence excellence how. Wishing an if he sixteen visited tedious subject it. Mind mrs yet did quit high even you went. Sex against the two however not nothing prudent colonel greater. Up husband removed parties staying he subject mr.";
            Alert info1 = new Alert(Alert.AlertType.INFORMATION);
            info1.setTitle("News");
            info1.setHeaderText("HOT NEWS");
            info1.setContentText(str);
            info1.show();
        });
        label3.setOnMouseClicked(event -> {
            String str = "Offered say visited elderly and. Waited period are played family man formed. He ye body or made on pain part meet. You one delay nor begin our folly abode. By disposed replying mr me unpacked no. As moonlight of my resolving unwilling.\n" +
                    "\n" +
                    "If wandered relation no surprise of screened doubtful. Overcame no insisted ye of trifling husbands. Might am order hours on found. Or dissimilar companions friendship impossible at diminution. Did yourself carriage learning she man its replying. Sister piqued living her you enable mrs off spirit really. Parish oppose repair is me misery. Quick may saw style after money mrs.";
            Alert info1 = new Alert(Alert.AlertType.INFORMATION);
            info1.setTitle("News");
            info1.setHeaderText("OMG WHAT HAPPENED WITH AMERICA");
            info1.setContentText(str);
            info1.show();
        });
        label4.setOnMouseClicked(event -> {
            String str = "Detract yet delight written farther his general. If in so bred at dare rose lose good. Feel and make two real miss use easy. Celebrated delightful an especially increasing instrument am. Indulgence contrasted sufficient to unpleasant in in insensible favourable. Latter remark hunted enough vulgar say man. Sitting hearted on it without me.\n" +
                    "\n" +
                    "One advanced diverted domestic sex repeated bringing you old. Possible procured her trifling laughter thoughts property she met way. Companions shy had solicitude favourable own. Which could saw guest man now heard but. Lasted my coming uneasy marked so should. Gravity letters it amongst herself dearest an windows by. Wooded ladies she basket season age her uneasy saw. Discourse unwilling am no described dejection incommode no listening of. Before nature his parish boy.\n";
            Alert info1 = new Alert(Alert.AlertType.INFORMATION);
            info1.setTitle("News");
            info1.setHeaderText("INDIA");
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

