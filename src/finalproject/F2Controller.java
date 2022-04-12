/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class F2Controller implements Initializable {
private Parent root;
private Scene scene;
private Stage stage;

    @FXML
    private Label type;

    @FXML
    private CheckBox NOoily; //غير دهنية 

    @FXML
    private CheckBox NOdry; // غير جافة

    @FXML
    private CheckBox DryZone;// جافة 

    @FXML
    private Button finish;
    
     @FXML
    private CheckBox fine;// خطوط دقيقة و تجاعيد 

    @FXML
    private CheckBox Flaky; // سطح بشرة قشري

    @FXML
    private CheckBox ProneSensitivity;// معرضة للحساسية 

    @FXML
    private CheckBox NONsensitivity; // غير حساسة 

    @FXML
    void Back(ActionEvent event) throws IOException {
         root=FXMLLoader.load(getClass().getResource("face.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    void typeSkin(ActionEvent event) {
        if(NOoily.isSelected()){
            type.setText("Normal skin type");
        }
        else if(NOdry.isSelected()){
           type.setText("Normal skin type");  
        }
        else if(NONsensitivity.isSelected()){
           type.setText("Normal skin type");  
        }
        else if(NOoily.isSelected()&&NONsensitivity.isSelected()){
            type.setText("Normal skin type");
        }
        else if(NONsensitivity.isSelected()&&NOdry.isSelected()){
            type.setText("Normal skin type");
        }
        else if(NOoily.isSelected()&&NOdry.isSelected()){
            type.setText("Normal skin type");
        }
        else if(NOoily.isSelected()&&NOdry.isSelected()&&NONsensitivity.isSelected()){
            type.setText("Normal skin type");
        }
        //
        else if(DryZone.isSelected()){
            type.setText("Dry skin type");
        }
        else if(fine.isSelected()){
           type.setText("Dry skin type");  
        }
        else if(Flaky.isSelected()){
            type.setText("Dry skin type");
        }
        else if(ProneSensitivity.isSelected()){
           type.setText("Dry skin type");  
        }
        //
        else if(DryZone.isSelected()&&fine.isSelected()) {
            type.setText("Dry skin type");
        }
        else if(DryZone.isSelected()&&fine.isSelected()&&Flaky.isSelected()){
           type.setText("Dry skin type");  
        }
        else if(DryZone.isSelected()&&fine.isSelected()&&ProneSensitivity.isSelected()) {
            type.setText("Dry skin type");
        }
        else if(DryZone.isSelected()&&fine.isSelected()&&ProneSensitivity.isSelected()&&Flaky.isSelected()) {
            type.setText("Dry skin type");
        }
        //
        else if(DryZone.isSelected()&&Flaky.isSelected()){
           type.setText("Dry skin type");  
        }
        else if(DryZone.isSelected()&&ProneSensitivity.isSelected()) {
            type.setText("Dry skin type");
        }
        else if(DryZone.isSelected()&&ProneSensitivity.isSelected()&&Flaky.isSelected()) {
            type.setText("Dry skin type");
        }
        //
        else if(fine.isSelected()&&Flaky.isSelected()){
           type.setText("Dry skin type");  
        }
        else if(fine.isSelected()&&ProneSensitivity.isSelected()) {
            type.setText("Dry skin type");
        }
        else if(fine.isSelected()&&ProneSensitivity.isSelected()&&Flaky.isSelected()) {
            type.setText("Dry skin type");
        }
        //
        else if(ProneSensitivity.isSelected()&&Flaky.isSelected()) {
            type.setText("Dry skin type");
        }
        else
             type.setText("Please choose correctly"); 
    }
    
     @FXML
    void skin(ActionEvent event) throws IOException {
         if(type.getText()=="Dry skin type"){
        root=FXMLLoader.load(getClass().getResource("dry.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        } 
        else if(type.getText()=="Normal skin type"){
        root=FXMLLoader.load(getClass().getResource("normal.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }   
        else 
            type.setText("Please choose correctly");

    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
