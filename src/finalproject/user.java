/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author noosha
 */
public class user {
   private String UserName;
   private String Email;
   private String PassWord;
   private String ConfirmPassword;

    public user() {
    }

    public user(String UserName, String Email, String PassWord, String ConfirmPassword) {
        this.UserName = UserName;
        this.Email = Email;
        this.PassWord = PassWord;
        this.ConfirmPassword = ConfirmPassword;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }
  
}
