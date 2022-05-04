package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LogoutPage extends Utility {
    By logout =By.id("Log out");

    public String verifyLogoutbutton(){
        return getTextFromElement(logout);

    }

}
