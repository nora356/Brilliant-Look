/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author noosha
 */
public class LeaserController implements Initializable {
private Parent root;
private Scene scene;
private Stage stage;
@FXML
  private ComboBox Lcombo;
@FXML
 protected void Back(ActionEvent event) throws IOException{
         root=FXMLLoader.load(getClass().getResource("skinhiarleaser.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
  @FXML
   public  void Select(ActionEvent event) {
        String s =Lcombo.getSelectionModel().getSelectedItem().toString();
        
        
        

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         ObservableList<String>list = FXCollections.observableArrayList("1 ","2","3","4");
        Lcombo.setItems(list);
    }    
    
}
