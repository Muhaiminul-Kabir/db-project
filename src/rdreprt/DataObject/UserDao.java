/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdreprt.DataObject;

import java.sql.SQLException;
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

        DataBase.runQuery("INSERT INTO USERS "
                + "VALUES"
                + "("
                + "'" + localUser.getName() + "',"
                + "'" + localUser.getAge() + "',"
                + "'" + localUser.getGender() + "',"
                + "'" + localUser.getBg() + "',"
                + "'" + localUser.getMobile() + "',"
                + "'" + localUser.getPass() + "',"
                + "'" + localUser.getEmail()+ "',"
                + "'" + localUser.getDiv() + "',"
                + "'" + localUser.getDist() + "',"
                + "'" + localUser.getUpz() + "'"
                + ")");

    }

    public boolean find() {

        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
