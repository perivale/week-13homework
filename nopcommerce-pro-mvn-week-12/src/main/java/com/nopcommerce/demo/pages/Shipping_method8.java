package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Shipping_method8 extends Utility {
    By radiobutton=By.id("shippingoption_1");
    By continuebu=By.xpath("//button[@onclick='ShippingMethod.save()']");

    public void clickonradiobutton(){
        clickOnElement(radiobutton);
    }
    public void clickoncontibutton(){
        clickOnElement(continuebu);
    }
}
