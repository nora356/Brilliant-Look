
package finalproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class ProudctController implements Initializable {
private Parent root;
private Scene scene;
private Stage stage;
@FXML
   ComboBox comb;
ObservableList<String>list = FXCollections.observableArrayList("Moisturing Proudct ","Hair Proudct");


@FXML
    protected void Back(ActionEvent event) throws IOException{
        root=FXMLLoader.load(getClass().getResource("services.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void Select(ActionEvent event) throws IOException {
        int index = comb.getSelectionModel().getSelectedIndex();
        
        if (index== 0)
       {
            
                            root=FXMLLoader.load(getClass().getResource("MoisturizingPR.fxml"));
                            stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
                            scene = new Scene(root);
                            stage.setScene(scene);
                            stage.show();
                    
        }
       
       if (index == 1)
       {
                            root=FXMLLoader.load(getClass().getResource("hairproudct.fxml"));
                            stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
                            scene = new Scene(root);
                            stage.setScene(scene);
                            stage.show();
        }

    }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        comb.setItems(list);
        
    } 
   
       }
   
    

