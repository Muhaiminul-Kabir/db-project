/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdreprt;

import rdreprt.Utility.DataBase;
import rdreprt.DataObject.UserDao;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import static javafx.scene.input.KeyCode.T;
import rdreprt.DataObject.GeoCodeDao;
import rdreprt.Entity.GeoCode;
import static rdreprt.Utility.DataBase.connectDb;
import rdreprt.Entity.User;
import rdreprt.Utility.Misc;
import static rdreprt.Utility.Misc.validateAge;
import static rdreprt.Utility.Misc.validateEmail;
import static rdreprt.Utility.Misc.validateMobile;
import static rdreprt.Utility.Misc.validateName;
import static rdreprt.Utility.Misc.validatePass;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class SignupController implements Initializable {

    @FXML
    private JFXTextField userName;
    @FXML
    private JFXTextField userAge;
    @FXML
    private JFXComboBox<String> userDivision;
    @FXML
    private JFXComboBox<String> userDistrict;
    @FXML
    private JFXComboBox<String> userUpazilla;
    @FXML
    private JFXTextField userMobile;
    @FXML
    private JFXTextField userEmail;
    @FXML
    private JFXComboBox<String> userGender;
    @FXML
    private JFXTextField userPass;
    @FXML
    private JFXComboBox<String> userBG;
    @FXML
    private JFXButton regB;

    GeoCode userGeoCode;
    GeoCodeDao gcProc;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            initGender();

            initDivision();

        } catch (Exception ex) {
            Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, ex);
        }
        initBG();

    }

    @FXML
    private void registerUser(ActionEvent event) throws SQLException, ClassNotFoundException {

        User newUser = new User(
                userName.getText(),
                Integer.parseInt(userAge.getText()),
                userMobile.getText(),
                userDivision.getValue(),
                userDistrict.getValue(),
                userUpazilla.getValue(),
                userPass.getText(),
                userGender.getValue(),
                userBG.getValue(),
                userEmail.getText()
        );

        
        
        if (validateRegistry()) {
            UserDao uproc = new UserDao(newUser);
            uproc.add();
        }

    }
    
    
    
    public boolean validateRegistry() {
        boolean a = validateName();
        boolean b = validatePass();
        boolean c = validateAge();
        boolean d = validateEmail();
        boolean e = validateMobile();
        if (a && b && c && d && e) {
            return true;
        }
        return false;

    }

    private void initGender() throws SQLException, ClassNotFoundException {

        String[] choice = {"Male", "Female"};
        userGender.getItems().addAll(choice);
        userGender.setValue("Male");

    }

    private void initDivision() throws SQLException, ClassNotFoundException {
        ArrayList<String> list = DataBase.getDataList("SELECT DivisionName FROM Division;", "DivisionName");
        userDivision.getItems().addAll(list);

    }

    @FXML
    private void initDistrict() throws SQLException, ClassNotFoundException {
        String div = userDivision.getValue();
        userGeoCode = new GeoCode(div);
        gcProc = new GeoCodeDao(userGeoCode);
        
        ArrayList<String> list = gcProc.getDistList();
        
        userDistrict.getItems().addAll(list);

    }

    @FXML
    private void initUpazilla() throws SQLException, ClassNotFoundException {
        String dist = userDistrict.getValue();
        
        userGeoCode.setDistName(dist);
        ArrayList<String> list = gcProc.getUpzList();
        
        
        userUpazilla.getItems().addAll(list);
    }

    private void initBG() {
        String[] choice = {"A+", "A-", "O+", "O-","B+","B-", "AB+", "AB-"};
        userBG.getItems().addAll(choice);
        userBG.setValue("A+");
    }

}
