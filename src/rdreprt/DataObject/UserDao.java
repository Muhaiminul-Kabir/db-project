/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdreprt.DataObject;

import java.sql.SQLException;
import java.util.ArrayList;
import rdreprt.Entity.User;
import rdreprt.Utility.DataBase;

/**
 *
 * @author ASUS
 */
public class UserDao {

    User localUser;

    public UserDao(User foreginUser) {
        this.localUser = foreginUser;
    }

    public void add() throws SQLException, ClassNotFoundException {

        ArrayList<String> distId = DataBase.getDataList("SELECT DistrictId FROM Districts WHERE DistrictName = '" + localUser.getDist() + "'  ;", "DistrictId");
        ArrayList<String> divId = DataBase.getDataList("SELECT DivisionId FROM Division WHERE DivisionName = '" + localUser.getDiv() + "'  ;", "DivisionId");
        ArrayList<String> upzId = DataBase.getDataList("SELECT UpazilaId FROM Upazilas WHERE UpazilaName = '" + localUser.getUpz() + "'  ;", "UpazilaId");

        DataBase.runQuery("INSERT INTO USERS "
                + "VALUES"
                + "("
                + "'" + localUser.getType() + "',"
                + "'" + localUser.getName() + "',"
                + "'" + localUser.getAge() + "',"
                + "'" + localUser.getMobile() + "',"
                + "'" + divId.get(0) + "',"
                + "'" + distId.get(0) + "',"
                + "'" + upzId.get(0) + "',"
                + "'" + localUser.getPass() + "',"
                + "'" + localUser.getGender() + "',"
                + "'" + localUser.getBg() + "',"
                + "'" + localUser.getEmail() + "'"
                + ")");

    }

    public boolean read() {

        return false;
    }

    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
