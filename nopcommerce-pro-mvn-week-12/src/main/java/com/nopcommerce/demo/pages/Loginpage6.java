package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Loginpage6 extends Utility {
    By verifywelcomtext=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkouttab=By.xpath("//button[contains(text(),'Checkout as Guest')]");

    public String verifyWelcometext(){
        return getTextFromElement(verifywelcomtext);
    }
    public void clickOnCheckOuttab(){
        clickOnElement(checkouttab);
    }
}
