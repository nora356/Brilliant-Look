
package finalproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class FaceController implements Initializable {
private Parent root;
private Scene scene;
private Stage stage;

    
    @FXML
    private Circle cheek1;
    
    @FXML
    private Circle cheek2;
    
     @FXML
    private Ellipse nose;//الانف

    @FXML
    private Ellipse chin;//الذقن
    
    @FXML
    private Ellipse forehead;//الجبهة
    
     @FXML
    private Label type;
     

@FXML
    protected void Back(ActionEvent event) throws IOException{
         root=FXMLLoader.load(getClass().getResource("skinhiarleaser.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
     String STcheek1="Dry";
     String STcheek2="Dry";
     String STforehead="Dry";
     String STnose="Dry";
     String STchin="Dry";
      
      Color col= Color.rgb(210, 138, 116);
     
   @FXML                
    void hh(MouseEvent event) {
         if(cheek1.isPressed()){
             STcheek1="Oily";
             cheek1.setFill(col);
        }
        if(cheek2.isPressed()){
          STcheek2="Oily";
           cheek2.setFill(col);
        }
        if(forehead.isPressed()){
          STforehead="Oily";
           forehead.setFill(col);
        }
         if(nose.isPressed()){
          STnose="Oily";
          nose.setFill(col);
        }
          if(chin.isPressed()){
          STchin="Oily";
           chin.setFill(col);
        }
      
    }
    
      @FXML
    protected void typeSkin(ActionEvent event) {
        
        if((STforehead=="Oily")&&(STnose=="Oily")&&(STchin=="Oily")&&(STcheek1=="Dry")&&(STcheek2=="Dry")){
             type.setText("Combination skin type");
        }
        else if((STforehead=="Oily")&&(STnose=="Oily")&&(STchin=="Oily")&&(STcheek1=="Oily")&&(STcheek2=="Oily")){
             type.setText("Oily skin type");
        }
        else if((STforehead=="Dry")&&(STnose=="Dry")&&(STchin=="Dry")&&(STcheek1=="Dry")&&(STcheek2=="Dry")){
            type.setText("Please check how you feel");
            
             
             
        }

    }
    
      @FXML
    protected void skin(ActionEvent event) throws IOException{
        if(type.getText()=="Combination skin type"){
        root=FXMLLoader.load(getClass().getResource("combination.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        } 
        else if(type.getText()=="Oily skin type"){
        root=FXMLLoader.load(getClass().getResource("oliy.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }  
        else if(type.getText()=="Please check how you feel"){
        root=FXMLLoader.load(getClass().getResource("face2.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }  
        else 
            type.setText("Choose places");
            
        
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
