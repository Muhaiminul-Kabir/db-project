package rdreprt.Entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class GeoCode {
    private String divName;
    private String distName;
    private String upzName;
 
    
    public GeoCode(String divName){
        this.divName = divName;
        
    }
    
    public void setDivName(String divName) {

        this.divName = divName;
    }

    public void setUpzName(String upzName) {

        this.upzName = upzName;
    }

    public void setDistName(String distName) {

        this.distName = distName;
    }
    

    
    
    public String getDistName() {

        return distName;
    }
    
    
    public String getDivName() {

        return divName;
    }

    
    public String getUpzName() {

        return upzName;
    }

  

    
    
    
    
    
    
    
}
