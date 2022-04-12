package finalproject;

import java.io.IOException;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class VerifyemailController implements Initializable {
    
private Parent root;
private Scene scene;
private Stage stage;

   @FXML
    private Button sendAgainn;
   
    @FXML
    private AnchorPane pa;

   @FXML
    private Pane nev;

    @FXML
    private Rectangle code;

    @FXML
    private Label n;

    @FXML
    private Label codeM;

    @FXML
    private Circle cerBACK;

    @FXML
    private Circle image;

    @FXML
    private Label email;
    
    
    @FXML
    private Label BLook;

    @FXML
    private Label Reset;

    @FXML
    private Label co;


    @FXML
    void Back(ActionEvent event) throws IOException {
        root=FXMLLoader.load(getClass().getResource("forget.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void confirm(ActionEvent event) throws IOException {
        root=FXMLLoader.load(getClass().getResource("newpassoword.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

   
    @FXML
    void remov(MouseEvent event) {
        if(cerBACK.isPressed()){
        nev.setStyle("-fx-background-color:#ffffff00");
        Color col= Color.rgb(255, 255, 255, 0);
        code.setFill(col);
        image.setFill(col);
        cerBACK.setFill(col);
        email.setText("");
        codeM.setText("");
        n.setText("");
        BLook.setText("");
        Reset.setText("");
        co.setText("");
        }
 
    }
    
    
      
      Image Circleimage = new Image("finalproject/emailIcon1.jpg");
      ImagePattern cI = new ImagePattern(Circleimage);
  
      
      
    @FXML
    void send(ActionEvent event) throws IOException {
         SecureRandom s=new SecureRandom();
         int c = s.nextInt(10000);
        String STcode = String.valueOf(c);
        
        Color col= Color.rgb(136, 136, 138,0.97);
        code.setFill(col);
        cerBACK.setFill(col);
        email.setText("Mail");
        codeM.setText(STcode);
        n.setText("now");
        image.setFill(cI);
        BLook.setText("Brilliant look");
        Reset.setText("Reset your password on Brilliant look");
        co.setText("Code:");
        
        TranslateTransition translate = new TranslateTransition (Duration.seconds(3.1), nev) ;
       translate.setToY(15) ;
       translate.play();
        
    }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
