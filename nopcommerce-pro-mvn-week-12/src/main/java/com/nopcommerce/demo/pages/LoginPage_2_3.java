package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage_2_3 extends Utility {
    By verifywelcomtext=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
  By Registertab=By.xpath("//button[contains(text(),'Register')]");
    public String verifyWelcometext(){
        return getTextFromElement(verifywelcomtext);
    }
 public  void clickOnregister(){
        clickOnElement(Registertab);
 }
}
