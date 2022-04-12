
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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author noosha
 */
public class NewaccountController implements Initializable {
private Parent root;
private Scene scene;
private Stage stage;
    @FXML
    private TextField Tname;

    @FXML
    private TextField Temail;

    @FXML
    private PasswordField Tpassword;

    @FXML
    private PasswordField Tconfirm;

    @FXML
    private Button Bsing;
     @FXML
    private Label lbname;

    @FXML
   public void createNewAccount(ActionEvent event) throws IOException { 
      
       String name=Tname.getText();
        Boolean Nname=false;
       if(name.length()<=10 ){
           //شرط اسم المستخدم
        for (int i = 0; i < name.length(); i++) {
        if(name.charAt(i)>'a'&&name.charAt(i)<'z'){
        Nname=true;
        }
        else if(name.charAt(i)=='-'||name.charAt(i)=='_'||name.charAt(i)=='@'||name.charAt(i)=='#'||name.charAt(i)=='@'||name.charAt(i)=='!'){
        Nname=false;
      
        }}
        if(Nname== false){
         Alert c=new Alert(AlertType.INFORMATION);
 c.setContentText("*User name should only contain uppercase , lowercase ,and number.");
 c.showAndWait();}
      //الي هنا  
   
       }
       else{
       
       Alert g=new Alert(AlertType.INFORMATION);
 g.setContentText(" User name Invalid because it is more than 10 characters .");
 g.showAndWait();
       }
  //شرط الايميل      
      String email=Temail.getText(); 
      Boolean y=false;
    for (int i = 0; i < email.length(); i++) {
        if(email.charAt(i)=='#'||email.charAt(i)=='('||email.charAt(i)==')'||email.charAt(i)=='{'||email.charAt(i)=='}'||email.charAt(i)=='*'||email.charAt(i)=='!'||email.charAt(i)=='%'|| email.charAt(i)=='^'||email.charAt(i)=='&'||email.charAt(i)=='='||email.charAt(i)=='+'||email.charAt(i)=='/' ||email.charAt(i)=='?'||email.charAt(i)=='|'||email.charAt(i)==':'||email.charAt(i)=='<'||email.charAt(i)=='>'){
        y=false;
        }
    else {
        y=true;
      
        }}
   
    if(y== false){
         Alert e=new Alert(AlertType.INFORMATION);
 e.setContentText("*Email Should only contain uppercase , lowercase ,number ,and @.");
 e.showAndWait();}
      //الي هنا  
  
       
         String password= Tpassword.getText();  
         String confirm=Tconfirm.getText();
         Boolean p=false;
         if(password.length()==10){
         for (int i = 0; i < password.length(); i++) {
        if(password.charAt(i)>'a'&&password.charAt(i)<'z'){
        p=true;
        }
           else if(password.charAt(i)=='-'||password.charAt(i)=='_'||password.charAt(i)=='#'||password.charAt(i)=='@'||password.charAt(i)=='!'||password.charAt(i)=='#'||password.charAt(i)=='('||password.charAt(i)==')'||password.charAt(i)=='{'||password.charAt(i)=='}'||password.charAt(i)=='*'||password.charAt(i)=='!'||password.charAt(i)=='%'||password.charAt(i)=='^'||password.charAt(i)=='&'||password.charAt(i)=='='||password.charAt(i)=='+'||email.charAt(i)=='/' ||password.charAt(i)=='?'||password.charAt(i)=='|'||password.charAt(i)==':'||password.charAt(i)=='<'||password.charAt(i)=='>'){
        p=false;
           }  
         }
         
     if(p == false){
         Alert e=new Alert(AlertType.INFORMATION);
 e.setContentText("* Password Should only contain uppercase , lowercase , and number ");
 e.showAndWait();}
      //الي هنا 
         }
         else{ 
             Alert q=new Alert(AlertType.INFORMATION);
 q.setContentText(" Password Invalid because it is more than or less than 10 characters .");
 q.showAndWait();}
         
         Boolean o=false;
          for (int i = 0; i < confirm.length(); i++) {
          if(password.equals(confirm)){
          o=true;
          }
          else{
          o=false;
          }
          }
          if(o == false )
          {Alert q=new Alert(AlertType.INFORMATION);
 q.setContentText(" Password confirm Invalid because it dose not match the password ");
 q.showAndWait();}
        if(Nname==true && y==true &&p==true && o==true) {
       root=FXMLLoader.load(getClass().getResource("services.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();  } 
   }
  
    @FXML
    protected void Back(ActionEvent event) throws IOException{
         root=FXMLLoader.load(getClass().getResource("home.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private Text Tlog;
    @FXML
    protected void TOlog(MouseEvent event) throws IOException{
             root=FXMLLoader.load(getClass().getResource("login.fxml"));
            Tlog.setOnMouseClicked(e ->{
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
    public void initialize(URL location, ResourceBundle resources) {
     lbname.textProperty().bind(Tname.textProperty());
    }
}