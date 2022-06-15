/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdreprt;

import rdreprt.Utility.Misc;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage; 

/**
 *
 * @author ASUS
 */
public class RDREPRT extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("wc.fxml"));
        Misc.changeTo(root1);
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
