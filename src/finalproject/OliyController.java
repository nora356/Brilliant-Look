
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class OliyController implements Initializable {
private Parent root;
private Scene scene;
private Stage stage;


    @FXML
    private Circle serum;

    @FXML
    private Circle Sunscreen;

    @FXML
    private Circle Cleanser;

    @FXML
    private Circle Moisturize;

    @FXML
    private Circle toner;
    
    @FXML
    private Rectangle REmasseg;

    @FXML
    private Label masseg;

    @FXML
    private Button Xmasseg;

    @FXML
    void text(MouseEvent event) {
        Color col= Color.rgb(194, 128, 139,0.81);
         REmasseg.setFill(col);
         REmasseg.setStrokeWidth(2);
         Color col2= Color.rgb(228, 211, 211);
         REmasseg.setStroke(col2);
         Xmasseg.setText("X");
         Xmasseg.setStyle("-fx-border-color:#e4d3d3; -fx-background-color:#ffffff00");
        if(serum.isPressed()){
         masseg.setText("Facial serums are the new rage in your skincare routine that repair, hydrate, and rejuvenate your skin from within.\n\n"
                 + "     How to apply?\n" +
                        "1.Warm 3-5 drops in your hands before applying a thick serum to the face");
        }
        else if(Cleanser.isPressed()){
             masseg.setText("How to apply?\n" +
                           "1. Wet your face and apply your cleanser\n" +
                           "2. Rinse your face\n" +
                           "3. Dry your face with a clean towel");
            }
        else if(toner.isPressed()){
             masseg.setText("Toner is a lightweight skin care product that can help shrink the appearance of pores and control oil.\n \n "
                           + "How to apply?\n" +
                            "1.Soak a piece of cotton with toner, then swipe it all over your face, neck and chest.");
            }
        else if(Moisturize.isPressed()){
             masseg.setText("How to apply?\n" +
                            "1.Warm up moisturizer in hands. \n" +
                            "2.Apply to cheeks using gentle circular motions. \n" +
                            "3.Apply to forehead and rest of face.");
            }
        else if(Sunscreen.isPressed()){
             masseg.setText("Oily skin is more resistant to sun damage than other skin types due to the added layers of natural oil. However, that doesn't give you an excuse to skip the sunscreen.\n\n"
                     + "     How to apply?\n" +
                            " 1.Just in case you want to put a dot of sunscreen directly on your face");
            }

    }

@FXML
    protected void Back(ActionEvent event) throws IOException{
         root=FXMLLoader.load(getClass().getResource("face.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
     @FXML
    void closeMasseg(ActionEvent event) {
         Color col= Color.rgb(255, 255, 255, 0);
         REmasseg.setFill(col);
         REmasseg.setStrokeWidth(0);
         REmasseg.setStroke(col);
         Xmasseg.setText("");
         Xmasseg.setStyle("-fx-border-color:#ffffff00; -fx-background-color:#ffffff00");
         masseg.setText("");

    }
    
    @FXML
    void goList(ActionEvent event) throws IOException {
        root=FXMLLoader.load(getClass().getResource("routineO.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
