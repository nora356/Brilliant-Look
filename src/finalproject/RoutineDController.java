
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
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class RoutineDController implements Initializable {
private Parent root;
private Scene scene;
private Stage stage;
    
    ObservableList<String> todo= FXCollections.observableArrayList("Cleanser",
                         "Vitamin C", "Moisturizing", "Sunscreen");
    
    ObservableList<String> done= FXCollections.observableArrayList();
 
     
    @FXML
    private ListView<String> listdone;

    @FXML
    private ListView<String> listtodo;
   
    @FXML
    void Back(ActionEvent event) throws IOException {
        root=FXMLLoader.load(getClass().getResource("dry.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
     @FXML
    void Todo(KeyEvent event) {
    listdone.setOnKeyPressed(e->{String str = listdone.getSelectionModel().getSelectedItem();
    if (str != null) {
        if(e.getCode() == KeyCode.LEFT)
    listdone.getSelectionModel().clearSelection();
    done.remove(str);
    todo.add(str);  }}
             
);
    
    
     
    }

    @FXML
    void Todone(KeyEvent event) {
    listtodo.setOnKeyPressed(e->{String str = listtodo.getSelectionModel().getSelectedItem();
    if (str != null) {
         if(e.getCode() == KeyCode.RIGHT)
    listtodo.getSelectionModel().clearSelection();
    todo.remove(str);
    done.add(str);}}
            
);
    
    
    
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        listdone.setItems(done);
        listtodo.setItems(todo);
    }        
    
}
