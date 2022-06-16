/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdreprt.DataObject;

import java.sql.SQLException;
import java.util.ArrayList;
import rdreprt.Entity.GeoCode;
import rdreprt.Utility.DataBase;

/**
 *
 * @author ASUS
 */
public class GeoCodeDao {

    GeoCode localGeoCode;

    public GeoCodeDao(GeoCode forreignGeoCode) {
        this.localGeoCode = forreignGeoCode;
    }

    public String getDivId() throws SQLException, ClassNotFoundException {

        ArrayList<String> divId = DataBase.getDataList("SELECT DivisionId FROM Division WHERE DivisionName = '" + localGeoCode.getDivName() + "'  ;", "DivisionId");
        
        return divId.get(0);
        
    }
    
    public String getDistId() throws SQLException, ClassNotFoundException {
        ArrayList<String> distId = DataBase.getDataList("SELECT DistrictId FROM Districts WHERE DistrictName = '" + localGeoCode.getDistName() + "'  ;", "DistrictId");
        return distId.get(0);
    }
    
    
    public String getUpzId() throws SQLException, ClassNotFoundException {
        ArrayList<String> upzId = DataBase.getDataList("SELECT UpazilaId FROM Upazilas WHERE UpazilaName = '" + localGeoCode.getUpzName() + "'  ;", "UpazilaId");
        return upzId.get(0);
    }

    public ArrayList getUpzList() throws SQLException, ClassNotFoundException{
    
        return  DataBase.getDataList("SELECT UpazilaName FROM Upazilas WHERE DistrictId = " + getDistId() + ";", "UpazilaName");

    
    }
    
    public ArrayList getDistList() throws SQLException, ClassNotFoundException{
    
        return   DataBase.getDataList("SELECT DistrictName FROM Districts WHERE DivisionId = " + getDivId()+ ";", "DistrictName");

    
    }
    
    
}
