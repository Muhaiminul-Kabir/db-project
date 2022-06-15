/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdreprt;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;
import rdreprt.Utility.Misc;
import rdreprt.LoginController;

/**
 *
 * @author ASUS
 */
public class WcController {

    @FXML
    JFXButton bt0;
    @FXML
    JFXButton bt1;
    @FXML
    JFXButton bt2;

    @FXML
    JFXButton gb;
    
    
    
    @FXML
    public void btClick0(ActionEvent e) throws IOException {
        toLogin(bt0);
    }
    
    
    @FXML
    public void btClick1(ActionEvent e) throws IOException {
        toLogin(bt1);
    }
    
    
    @FXML
    public void btClick2(ActionEvent e) throws IOException {
        toLogin(bt2);
    }
    
    
    
    @FXML
    public void toRegistry(ActionEvent e) throws IOException{
        
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
    
    
    private void toLogin(JFXButton b) throws IOException{
        Misc.closeWindowOnButton(b);
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "/rdreprt/login.fxml"
                ));
        Parent root = loader.load();
        LoginController ctrl = loader.getController();
        
        ctrl.setTitle(b.getText());
                    
        
        
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    
    
    

}
