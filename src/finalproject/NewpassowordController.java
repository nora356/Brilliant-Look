
package finalproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class NewpassowordController implements Initializable {

private Parent root;
private Scene scene;
private Stage stage;

@FXML
    private PasswordField now;


    @FXML
    private PasswordField ver;
    
    @FXML
    private Label text;

    @FXML
    private Label log;

    
   
    @FXML
    void con(ActionEvent event) {
         String n =now.getText();
         String v =ver.getText();
    
        if(n.equals(v)){
            text.setText("Password has been set successfully");
            text.setStyle("-fx-text-fill:WHITE");
            log.setText("Log in");
            
        }
        else if(!n.equals(v)){
            text.setStyle("-fx-text-fill:RED");
            text.setText("Password does not match");  
        }
        else
        {
            text.setText("Please enter a password ");
            text.setStyle("-fx-text-fill:WHITE");
        }

    }

    @FXML
    void login(MouseEvent event) throws IOException {
        if(log.isPressed()){
            root=FXMLLoader.load(getClass().getResource("login.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }

    }

@FXML
    protected void Back(ActionEvent event) throws IOException{
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
