package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Onepagecheckout9 extends Utility {
    By creditcard=By.id("paymentmethod_1");
    By continuebutton=By.xpath("//button[@onclick='PaymentMethod.save()']");
    public void clickoncreditcard(){
        clickOnElement(creditcard);
    }
    public void clickoncontinuebutton(){
        clickOnElement(continuebutton);

    }
}
