package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By usernamefiled=By.id("txtUsername");
    By passwordfiled=By.id("txtPassword");
    By loginfiled=By.xpath("//input[@name='Submit']");
    By verifytext1=By.id("welcome");
 //   By forgotpassword=By.xpath("//div[@id=\"forgotPasswordLink\"]//child::a");
    By forgotpass=By.linkText("Forgot your password?");

    public void enterUserName(String text){
        sendTextToElement(usernamefiled,text);
    }
    public void enterPassword(String text){
        sendTextToElement(passwordfiled,text);
    }
    public void enterloginfiled(){
        clickOnElement(loginfiled);
    }
    public  String getVerifyText(){
      return getTextFromElement(verifytext1);

    }
    public void clickonforgotpassowrd(){
        clickOnElement(forgotpass);

    }

}
