
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
import javafx.stage.Stage;

public class ServicesController implements Initializable {
private Parent root;
private Scene scene;
private Stage stage;

    @FXML
    void TOservices(ActionEvent event) throws IOException {
        root=FXMLLoader.load(getClass().getResource("skinhiarleaser.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setTitle("new account");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void TOproducts(ActionEvent event) throws IOException{
         root=FXMLLoader.load(getClass().getResource("proudct.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setTitle("new account");
        stage.setScene(scene);
        stage.show();
    }
    
     @FXML
    void TOmask(ActionEvent event) throws IOException{
         root=FXMLLoader.load(getClass().getResource("mixtures.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setTitle("new account");
        stage.setScene(scene);
        stage.show();
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
