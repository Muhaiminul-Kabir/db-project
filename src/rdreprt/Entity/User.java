/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdreprt.Entity;

/**
 *
 * @author ASUS
 */
public class User {
    private String type = "normal-user";
    
    private String name;
    private int age;
    private String mobile;
    private String div;
    private String dist;
    private String upz;
    private String password;
    private String gender;
    private String bg;
    private String email;

    public User(String name, int age, String mobile, String div, String dist, String upz, String password, String gender, String bg,String email) {

        
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.div = div;
        this.dist = dist;
        this.upz = upz;
        this.password = password;
        this.gender = gender;
        this.bg = bg;
        this.email = email;

    }

    public User() {
        
    }

    
    
    public void setType(String type) {

        this.type = type;
    }
    
    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setBg(String bg) {

        this.bg = bg;
    }

    public void setPass(String password) {

        this.password = password;
    }

    public void setDiv(String div) {

        this.div = div;
    }

    public void setDist(String dist) {

        this.dist = dist;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public void setUpz(String upz) {

        this.upz = upz;
    }

    public void setMobile(String mobile) {

        this.name = mobile;
    }

    
    
    public String getType() {

        return type;
    }

    
    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public String getBg() {

        return bg;
    }

    public String getPass() {

        return password;
    }

    public String getDiv() {

        return div;
    }

    public String getDist() {

        return dist;
    }

    public String getGender() {

        return gender;
    }

    public String getUpz() {

        return upz;
    }

    public String getMobile() {

        return mobile;
    }

    public String getEmail() {
        return email;
    }

}
