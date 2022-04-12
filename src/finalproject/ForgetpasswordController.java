
package finalproject;

import java.io.IOException;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ForgetpasswordController implements Initializable {

    private Parent root;
private Scene scene;
private Stage stage;

    
    @FXML
    protected void Back(ActionEvent event) throws IOException{
         root=FXMLLoader.load(getClass().getResource("login.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
  
      
     @FXML
    protected void check(ActionEvent event) throws IOException{
        /*nev.setStyle("-fx-background-color:  #5d5c38");
        x.setStyle("-fx-background-color: #f3e6ff");
        x.setText("X");
        c.setText(STcode);
        c1.setText(STcode);*/
        
         root=FXMLLoader.load(getClass().getResource("verifyemail.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
   
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    
}
