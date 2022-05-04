package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By username=By.id("user-name");
    By password=By.id("password");
    By loginbutton=By.id("login-button");


    public void enterusername(String text){
        sendTextToElement(username,text);
    }
    public void enterpassword(String text){
        sendTextToElement(password,text);
    }
    public void enterloginbutton(){
        clickOnElement(loginbutton);
    }


}
