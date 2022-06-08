/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdreprt;

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
        Parent root1 = FXMLLoader.load(getClass().getResource("FXML/wc.fxml"));
        Stage stage2 = new Stage();
        Scene scene = new Scene(root1);
        stage2.setTitle("RDREPRT");
        stage2.setScene(scene);
        stage2.show();
        
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
