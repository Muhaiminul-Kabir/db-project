/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdreprt;

import rdreprt.Utility.Misc;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author ASUS
 */
public class LoginController {
    
    @FXML
    Label l1;
    
    @FXML
    JFXButton gb;
    
    
    public void setTitle(String string) {
        l1.setText(string);
    }
    
    @FXML
    private void toRegistry(ActionEvent e) throws IOException{
        
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "/rdreprt/signup.fxml"
                ));
        Parent root = loader.load();
        SignupController ctrl = loader.getController();
        
        
        
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
}
