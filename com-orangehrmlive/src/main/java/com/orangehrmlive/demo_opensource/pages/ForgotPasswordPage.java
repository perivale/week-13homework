package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {
By verifyforgotpassword=By.xpath("//div[@class='head']");
 //   By verifytextforgotpassword=By.xpath("//div[@id=forgotPasswordLink]//child::a");



    public String  verifyforgotpassowrdMeesage1(){

        return getTextFromElement(verifyforgotpassword);
    }

}




