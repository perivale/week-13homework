package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterResultesPage extends Utility {
    By verifytext=By.cssSelector("div.result");

    public String verifythetext(){
        return  getTextFromElement(verifytext);

    }
}
