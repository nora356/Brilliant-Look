
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
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class SkinhiarleaserController implements Initializable {
    
private Parent root;
private Scene scene;
private Stage stage;
 @FXML
private Rectangle rFace;
  @FXML
private Rectangle rHair;
   @FXML
private Rectangle rLeaser;

@FXML
    protected void Back(ActionEvent event) throws IOException{
         root=FXMLLoader.load(getClass().getResource("services.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
       @FXML
        protected void TOface(MouseEvent event) throws IOException{
             root=FXMLLoader.load(getClass().getResource("face.fxml"));
            rFace.setOnMouseClicked(e ->{
        if(e.getButton() == MouseButton.MIDDLE){   
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
        if(e.getButton() == MouseButton.PRIMARY){   

         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
         if(e.getButton() == MouseButton.SECONDARY){   
        
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
         }
            });
        
         }
        
           @FXML
        protected void TOhair(MouseEvent event) throws IOException{
             root=FXMLLoader.load(getClass().getResource("hair.fxml"));
            rHair.setOnMouseClicked(e ->{
        if(e.getButton() == MouseButton.MIDDLE){   
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
        if(e.getButton() == MouseButton.PRIMARY){   

         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
         if(e.getButton() == MouseButton.SECONDARY){   
        
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
         }
            });
        
         }
        
         @FXML
        protected void TOleaser(MouseEvent event) throws IOException{
             root=FXMLLoader.load(getClass().getResource("leaser.fxml"));
            rLeaser.setOnMouseClicked(e ->{
        if(e.getButton() == MouseButton.MIDDLE){   
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
        if(e.getButton() == MouseButton.PRIMARY){   

         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
         if(e.getButton() == MouseButton.SECONDARY){   
        
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
         }
            });
        
         }
         
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
